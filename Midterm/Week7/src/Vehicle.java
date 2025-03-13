/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class Vehicle implements Dieselable{
    protected double fuel;
    
    public Vehicle()
    {
        this(0.0);
    }
    
    public Vehicle(double fuel)
    {
        this.fuel = fuel;
    }
    
    public void addFuel(double fuel)
    {
        if (fuel < 0)
        {
            System.out.println("Fuel is empty.");
        }
        else
        {
            this.setFuel(this.getFuel() + fuel);
        }
    }
    
    public abstract void honk();

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }
}
