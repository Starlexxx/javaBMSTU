package lab3.carbase;

public class Driver {
    private Car assignedCar;
    private Trip assignedTrip;

    public void requestRepair() {
        if (assignedCar != null) {
            assignedCar.setCondition("Needs Repair");
        }
        assert assignedCar != null;
        System.out.println("Car condition: " + assignedCar.getCondition());
    }

    public void markTripCompleted() {
        if (assignedTrip != null) {
            assignedTrip.setStatus("Completed");
        }
        assert assignedTrip != null;
        System.out.println("Trip status: " + assignedTrip.getStatus());
    }

    public void reportCarCondition() {
        if (assignedCar != null) {
            System.out.println("Car condition: " + assignedCar.getCondition());
        }
    }

    public void setAssignedTrip(Trip trip) {
        this.assignedTrip = trip;
    }

    public void setAssignedCar(Car car) {
        this.assignedCar = car;
    }
}
