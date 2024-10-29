package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */

public class Truck extends Machine implements Workable {
    private double loadCapacity;
    private int numberOfAxles;

    public Truck(double loadCapacity, int numberOfAxles) {
        this.loadCapacity = loadCapacity;
        this.numberOfAxles = numberOfAxles;
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }

}
