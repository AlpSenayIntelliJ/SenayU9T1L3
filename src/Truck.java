public class Truck extends Vehicle {
    private int axles;
    private boolean hasTrailer;

    public Truck(String licensePlate, double tollFee, int passengers, boolean paidTollStation, int axles, boolean hasTrailer) {
        super(licensePlate, tollFee, passengers, paidTollStation);
        this.axles = axles;
        this.hasTrailer = hasTrailer;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Axles: " + axles);
        System.out.println("Has trailer? " + hasTrailer);
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

    @Override
    public double calculateTollPrice() {
        if (hasTrailer) {
            return (getToll()*axles) * 2;
        }
        return getToll()*axles;
    }
}