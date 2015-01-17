package model;

public class Engine {
    
    public enum Type {Diesel,Gasoline}
    
    private final double cubicCapacity;
    private final Type type;

    public Engine(double cubicCapacity, Engine.Type type) {
        this.cubicCapacity = cubicCapacity;
        this.type = type;
    }

    public double getCubicCapacity() {
        return cubicCapacity;
    }

    public Type getType() {
        return type;
    }
    
}
