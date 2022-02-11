package com.itbulls.furman.oop.inheritence;

public class Bicycle {
    
    // the Bicycle class has three fields
    public int gear;
    public int speed;
        
    // the Bicycle class has one constructor
    public Bicycle(int startSpeed, int startGear) {
        gear = startGear;
        speed = startSpeed;
    }
        
    // the Bicycle class has three methods
        
    public void setGear(int newValue) {
        gear = newValue;
    }
        
    public void applyBrake(int decrement) {
        speed -= decrement;
    }
        
    public void speedUp(int increment) {
        speed += increment;
    }
        
}
 