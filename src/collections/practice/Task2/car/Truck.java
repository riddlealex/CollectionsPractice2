package collections.practice.Task2.car;

import java.util.Objects;

public class Truck extends Car{

    private double liftingCapacity;

    public Truck(int year, Brand brand, Model model, Color color, double liftingCapacity) {
        super(year, brand, model, color);
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Truck truck = (Truck) object;
        return Double.compare(liftingCapacity, truck.liftingCapacity) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), liftingCapacity);
    }

    @Override
    public String toString() {
        return "Truck{" +
                "liftingCapacity=" + liftingCapacity +
                '}';
    }

    public double getLiftingCapacity() {
        return liftingCapacity;
    }
}
