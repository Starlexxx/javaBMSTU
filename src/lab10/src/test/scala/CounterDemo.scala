import org.apache.spark.sql.SparkSession
import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.sql.functions._

object CounterDemo {

  val months: Seq[String] = Seq("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December")

  def loadData(spark: SparkSession): org.apache.spark.sql.DataFrame = {
    spark.read
      .format("com.databricks.spark.csv")
      .option("header", value = true)
      .load("/Users/starlex/Downloads/russian_air_service_CARGO_AND_PARCELS.csv")
  }

  def castColumnsToDouble(df: org.apache.spark.sql.DataFrame, columns: Seq[String]): org.apache.spark.sql.DataFrame = {
    columns.foldLeft(df) { (dataframe, column) =>
      dataframe.withColumn(column, col(column).cast("double"))
    }
  }

  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("CounterDemo").setMaster("local[*]")
    val sc = new SparkContext(conf)
    val spark = SparkSession.builder.appName("Test app").getOrCreate()

    val datafile = loadData(spark)
    val datafileWithNumericColumns = castColumnsToDouble(datafile, months)

    val numberOfAirports = datafile.select("Airport name").distinct().count()
    println(s"Number of airports: $numberOfAirports")

    val totalCargoAndParcels = datafileWithNumericColumns
      .withColumn("Total", months.map(month => col(month)).reduce(_ + _))
      .select("Airport name", "Total")

    val airportWithHighestTotal = totalCargoAndParcels.orderBy(desc("Total")).first()
    println(s"Airport with highest total cargo and parcels: ${airportWithHighestTotal.getAs[String]("Airport name")}")

    val averageTotal = totalCargoAndParcels.agg(avg("Total")).first().getDouble(0)
    println(s"Average total cargo and parcels: $averageTotal")

    val totalForAbakan = totalCargoAndParcels.filter(col("Airport name") === "Abakan").first().getDouble(1)
    println(s"Total cargo and parcels for Abakan: $totalForAbakan")

    val monthAverages = months.map(month => (month, datafileWithNumericColumns.agg(avg(month)).first().getDouble(0)))
    val monthWithHighestAverage = monthAverages.maxBy(_._2)
    println(s"Month with highest average cargo and parcels: ${monthWithHighestAverage._1}")

    val totalForEachMonth = months.map(month => (month, datafileWithNumericColumns.agg(sum(month)).first().getDouble(0)))
    totalForEachMonth.foreach { case (month, total) => println(s"Total cargo and parcels for $month: $total") }

    val airportWithLowestTotal = totalCargoAndParcels.orderBy("Total").first()
    println(s"Airport with lowest total cargo and parcels: ${airportWithLowestTotal.getAs[String]("Airport name")}")

    val totalForAllAirports = totalCargoAndParcels.agg(sum("Total")).first().getDouble(0)
    println(s"Total cargo and parcels for all airports: $totalForAllAirports")

    val numberOfAirportsWithNoCargo = totalCargoAndParcels.filter(col("Total") === 0.0).count()
    println(s"Number of airports with no cargo and parcels: $numberOfAirportsWithNoCargo")
  }
}