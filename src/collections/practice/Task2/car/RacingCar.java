package collections.practice.Task2.car;

import java.util.Objects;

public class RacingCar extends Car {

    private int maxSpeed;

    public RacingCar(int year, Brand brand, Model model, Color color, int maxSpeed) {
        super(year, brand, model, color);
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        RacingCar racingCar = (RacingCar) object;
        return maxSpeed == racingCar.maxSpeed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), maxSpeed);
    }

    @Override
    public String toString() {
        return "RacingCar{" +
                "maxSpeed=" + maxSpeed +
                '}';
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
