/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Plane extends Vehicle implements Flyable{
    private String airline;
    private String boeing;
    private static final int MAX_FLYER = 2;
    
    public Plane()
    {
        this(0.0, "", "");
    }
    
    public Plane(double fuel, String airline, String boeing)
    {
        super(fuel);
        this.airline = airline;
        this.boeing = boeing;
    }

    @Override
    public void startEngine()
    {
        if (super.getFuel() >= 20)
        {
            super.setFuel(super.getFuel() - 20);
            System.out.println("Plane’s Engine starts");
        }
        else
        {
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override
    public void stopEngine()
    {
        System.out.println("Plane’s Engine stops");
    }
    
    @Override
    public void honk()
    {
        System.out.println("Weeeeeee");
    }
    
    @Override
    public void fly()
    {
        if (super.getFuel() >= 20)
        {
            super.setFuel(super.getFuel() - 20);
            System.out.println("Plane Fly");
        }
        else
        {
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    @Override
    public void takeOff()
    {
        if (super.getFuel() >= 10)
        {
            super.setFuel(super.getFuel() - 10);
            System.out.println("Plane Already to Take Off");
        }
        else
        {
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    @Override
    public void landing()
    {
        if (super.getFuel() >= 10)
        {
            super.setFuel(super.getFuel() - 10);
            System.out.println("Plane Already to Landing");
        }
        else
        {
            System.out.println("Fuel is nearly empty.");
        }
    }
    
    public String getAirline() {
        return airline;
    }
    
    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getBoeing() {
        return boeing;
    }

    public void setBoeing(String boeing) {
        this.boeing = boeing;
    }
}
