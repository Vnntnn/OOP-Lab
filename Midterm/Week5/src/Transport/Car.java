/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport;

/**
 *
 * @author User
 */
public class Car extends Vehicle {
    private String typeEngine;
    
    public void setTypeEngine(String t) {
        typeEngine = t;
    }
    
    public String getTypeEngine() {
        return typeEngine;
    }
    
    public void setCarInfo(int s, String t, String y) {
        this.setFuel(s);
        this.setTopSpeed(t);
        this.setTypeEngine(y);
    }
    
    public void move() {
        if ((this.getFuel() - 50) < 0) {
            System.out.println("Please add fuel.");
        } else {
            System.out.println("Move.");
            int currentFuel = this.getFuel();
            this.setFuel(currentFuel - 50);
        }
    }
    
    public void showCarInfo() {
        System.out.println("Car engine is " + this.getTypeEngine() + ".");
        System.out.println("Fuel is " + this.getFuel() + " litre and Top Speed is " + this.getTopSpeed() + " m/s.");
    }
}
