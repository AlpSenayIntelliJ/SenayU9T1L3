public class Vehicle {
    private String licensePlate;
    private double tollFee;
    private int passengers;
    private boolean paidTollStation;

    public Vehicle(String licensePlate, double tollFee, int passengers, boolean paidTollStation) {
        this.licensePlate = licensePlate;
        this.tollFee = tollFee;
        this.passengers = passengers;
        this.paidTollStation = paidTollStation;
    }

    public void printInfo() {
        System.out.println("License plate: " + licensePlate);
        System.out.println("Toll fee: " + tollFee);
        System.out.println("Passengers: " + passengers);
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public double getToll() {
        return tollFee;
    }

    public void setTollFee(double tollFee) {
        this.tollFee = tollFee;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double calculateTollPrice() {
        return tollFee * passengers;
    }

    public boolean paidTollStation() {
        return paidTollStation;
    }
}