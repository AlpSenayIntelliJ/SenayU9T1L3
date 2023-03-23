public class Taxi extends Car {
    private double fareCollected;
    public Taxi(String licensePlate, double tollFee, int passengers, boolean electric, double fareCollected) {
        super(licensePlate, tollFee, passengers, electric);
        this.fareCollected = fareCollected;
    }
    public void printTaxi() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getToll());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is electric: " + isElectric());
        System.out.println("Has discount: " + getDiscountStatus());
        System.out.println("Has collected fare: " + fareCollected);
    }

    public void pickupRiders(int numRiders, double farePerRider) {
        setPassengers(getPassengers() + numRiders);
        fareCollected += (numRiders * farePerRider);
        if (getPassengers() >= 4 && !getDiscountStatus()) {
            setTollFee(getToll() * 0.5);
        }
        setDiscountApplied(true);
    }

    public double getFareCollected() {
        return fareCollected;
    }
}
