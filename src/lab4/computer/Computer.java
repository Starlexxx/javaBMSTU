package lab4.computer;

public class Computer {

    private Specifications specs;

    public Computer(Specifications specs) {
        this.specs = specs;
    }

    public Specifications getSpecs() {
        return specs;
    }

    public void setSpecs(Specifications specs) {
        this.specs = specs;
    }

    public static class Specifications {
        private String operatingSystem;
        private String processor;
        private String ram;

        public Specifications(String operatingSystem, String processor, String ram) {
            this.operatingSystem = operatingSystem;
            this.processor = processor;
            this.ram = ram;
        }

        public String getOperatingSystem() {
            return operatingSystem;
        }

        public void setOperatingSystem(String operatingSystem) {
            this.operatingSystem = operatingSystem;
        }

        public String getProcessor() {
            return processor;
        }

        public void setProcessor(String processor) {
            this.processor = processor;
        }

        public String getRam() {
            return ram;
        }

        public void setRam(String ram) {
            this.ram = ram;
        }

        @Override
        public String toString() {
            return "Specifications{" +
                    "operatingSystem='" + operatingSystem + '\'' +
                    ", processor='" + processor + '\'' +
                    ", ram='" + ram + '\'' +
                    '}';
        }
    }
}
