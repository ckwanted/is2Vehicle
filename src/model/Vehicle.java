package model;

public class Vehicle {
    
    private final double power;
    private Engine engine;

    public Vehicle(double power, double cubicCapacity, Engine.Type type) {
        this.power = power;
        this.engine = new Engine(cubicCapacity,type);
    }

    public double getPower() {
        return power;
    }

    public Engine getEngine() {
        return engine;
    }
    
}
