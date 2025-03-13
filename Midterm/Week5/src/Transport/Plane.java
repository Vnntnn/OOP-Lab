/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Transport;

/**
 *
 * @author User
 */
public class Plane extends Vehicle{
    public void setPlaneInfo(int s, String t) {
       this.setFuel(s);
       this.setTopSpeed(t);
    }
    
    public void fly() {
        if ((this.getFuel() - 200) < 0) {
            System.out.println("Please add fuel.");
        } else {
            System.out.println("Fly.");
            int currentFuel = this.getFuel();
            this.setFuel(currentFuel - 200);
        }
    }
    
    public void showPlaneInfo() {
        System.out.println("Plane detail is, Fuel is " + this.getFuel() + " litre and Top Speed is " + this.getTopSpeed() + " m/s.");
    }
}
