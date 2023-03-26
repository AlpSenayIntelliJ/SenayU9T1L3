public class Taxi extends Car {
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean paidTollStation, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, paidTollStation, electric);
        this.fareCollected = fareCollected;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Collected fare: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += (numRiders * farePerRider);
        if (getPassengers() >= 4 && !getDiscountStatus()) {
            setTollFee(getToll() * 0.5);
            setDiscountApplied(true);
        }
    }

    public double getFareCollected() {
        return fareCollected;
    }

    public boolean chargeAndDropOffRiders(double farePerRider) {
        int numRiders = getPassengers() -1;
        double totalFare = numRiders * farePerRider;
        fareCollected += totalFare;
        return dropOffPassengers(numRiders);
    }

    @Override
    public boolean paidTollStation() {
        int numRiders = getPassengers() -1;
        if (numRiders > 4) {
            fareCollected -= 5;
            return true;
        }
        return false;
    }
}
