public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean electric) {
        super(licensePlate, tollFee, passengers);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    public void printCar() {
        System.out.println("License plate: " + getLicensePlate());
        System.out.println("Toll fee: " + getToll());
        System.out.println("Passengers: " + getPassengers());
        System.out.println("Is electric: " + isElectric());
        System.out.println("Has discount: " + getDiscountStatus());
    }

    public boolean isElectric() {
        return electric;
    }

    public boolean getDiscountStatus() {
        return discountApplied;
    }

    public void setDiscountApplied(boolean x) {
        discountApplied = x;
    }

    public boolean dropOffPassengers(int numOut) {
        if (numOut >= getPassengers()) {
            return false;
        }
        setPassengers(getPassengers() - numOut);
        return true;
    }

    public void applyDiscount() {
        if (!discountApplied && isElectric()) {
            setTollFee(getToll() * 0.5);
            discountApplied = true;
        }
    }

}