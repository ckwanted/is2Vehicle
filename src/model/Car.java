package model;

public class Car extends Vehicle {
    
    private final boolean hasAirConditioning;

    public Car(boolean hasAirConditioning, double power, double cubicCapacity, Engine.Type type) {
        super(power, cubicCapacity, type);
        this.hasAirConditioning = hasAirConditioning;
    }

    public boolean isHasAirConditioning() {
        return hasAirConditioning;
    }
    
    @Override
    public String toString() {
        return "{airConditioning=" + hasAirConditioning + ",power=" + getPower() 
                + ",cubicCapacity=" + getEngine().getCubicCapacity() 
                + ",type=" + getEngine().getType() + "}";
    }
    
}
