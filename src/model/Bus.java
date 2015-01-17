package model;

public class Bus extends Vehicle {
    
    private final int seat;

    public Bus(int seats, double power, double cubicCapacity, Engine.Type type) {
        super(power, cubicCapacity, type);
        this.seat = seats;
    }

    public int getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "{seat=" + seat + ",power=" + getPower() 
                + ",cubicCapacity=" + getEngine().getCubicCapacity() 
                + ",type=" + getEngine().getType() + "}";
    }
    
}
