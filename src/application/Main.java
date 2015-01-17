package application;

import model.Bus;
import model.Car;
import model.Engine;
import model.Engine.Type;

public class Main {
    
    public static void main(String[] args) {
        
        try {
            
            Type diesel = Engine.Type.valueOf("Diesel");
            Type gasoline = Engine.Type.valueOf("Gasoline");
            Type x = Engine.Type.valueOf("as");
            
            Bus bus = new Bus(60, 3800, 1.8, gasoline);
            Car car = new Car(true, 1200, 1.8, diesel);
            
            System.out.println(bus);
            System.out.println(car);
            
        }
        catch(Exception exception) {
            System.out.println(exception.getMessage());
        }
        
    }
    
}
