public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    public void printTruck() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getToll());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Axles: " + axles);
        System.out.println("Has trailer: " + hasTrailer);
    }

    public boolean validateLicensePlate() {
        if (hasTrailer && axles > 4 && getLicensePlate().contains("MX")) {
            return true;
        }
        if (hasTrailer && axles <= 4 && getLicensePlate().contains("LX")) {
            return true;
        }
        return !hasTrailer;
    }
}