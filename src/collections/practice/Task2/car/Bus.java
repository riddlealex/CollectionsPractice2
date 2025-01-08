package collections.practice.Task2.car;

import java.util.Objects;

public class Bus extends Car{

    private int passengerAmount;


    public Bus(int year, Brand brand, Model model, Color color, int passengerAmount) {
        super(year, brand, model, color);
        this.passengerAmount = passengerAmount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Bus bus = (Bus) object;
        return passengerAmount == bus.passengerAmount;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), passengerAmount);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "passengerAmount=" + passengerAmount +
                '}';
    }

    public int getPassengerAmount() {
        return passengerAmount;
    }
}
