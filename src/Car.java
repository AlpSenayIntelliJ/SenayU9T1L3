public class Car extends Vehicle {
    private boolean electric;
    private boolean discountApplied;

    public Car(String licensePlate, double tollFee, int passengers, boolean paidTollStation, boolean electric) {
        super(licensePlate, tollFee, passengers, paidTollStation);
        this.electric = electric;
        discountApplied = false;   // default value
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Is electric? " + electric);
        System.out.println("Has discount? " + discountApplied);
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

    @Override
    public double calculateTollPrice() {
        if (getPassengers() > 4) {
            return getToll() * 4;
        }
        return super.calculateTollPrice();
    }

}