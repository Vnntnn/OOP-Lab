/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Ship extends Vehicle implements Floatable{
    public Ship()
    {
        super(0.0);
    }
    
    public Ship(double fuel)
    {
        super(fuel);
    }
    
    public void move()
    {
        this.fl0at();
    }
    
    public void move(int distance)
    {
        while (distance != 0) {
            if (super.getFuel() < 50)
            {
                System.out.println("Fuel is not enough.");
                return;
            }
            else
            {
                this.move();
                distance--;
            }
        }
    }

    @Override
    public void fl0at()
    {
        if (super.getFuel() >= 50)
        {
            super.setFuel(super.getFuel() - 50);
            System.out.println("Ship moves");
        }
        else
        {
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override
    public void startEngine()
    {
        if (super.getFuel() >= 10)
        {
            super.setFuel(super.getFuel() - 10);
            System.out.println("Engine starts");
        }
        else
        {
            System.out.println("Fuel is not enough.");
        }
    }
    
    @Override
    public void stopEngine()
    {
        System.out.println("Engine stops");
    }
    
    @Override
    public void honk()
    {
        System.out.println("Shhhhh");
    }
}
