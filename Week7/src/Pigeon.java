/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Pigeon extends Bird{
    private static int numberOfPigeon;
    
    public Pigeon()
    {
        this(0.0, 0.0, 0.0);
    }
    
    public Pigeon(double wingSize, double weight, double height)
    {
        super(wingSize, weight, height);
        Pigeon.numberOfPigeon += 1;
    }
    
    public void eat(String food)
    {
        if ((food.equals("worm")) == true)
        {
            super.setWeight(super.getWeight() + 0.5);
        }
        else if ((food.equals("seed")) == true)
        {
            super.setWeight(super.getWeight() + 0.2);
        }
        else
        {
            System.out.println("Pigeon can eat only worm and seed.");
        }
    }
    
    @Override
    public String toString()
    {
        return "Pigeon " + super.getWeight() + " kg and " + " " + super.getHeight() + " cm. There are " + Pigeon.numberOfPigeon + " pigeons.";
    }
    
    @Override
    public void fly()
    {
        if (super.getWeight() >= 5)
        {
            System.out.println("Fly Fly");
            super.setWeight(super.getWeight() - 0.25);
        }
        else
        {
            System.out.println("I'm hungry.");
        }
    }
    
    @Override
    public void takeOff()
    {
        if (super.getWeight() >= 5)
        {
            System.out.println("Take Off");
            super.setWeight(super.getWeight() - 0.5);
        }
        else
        {
            System.out.println("I'm hungry.");
        }
    }
    
    @Override
    public void landing()
    {
        if (super.getWeight() >= 5)
        {
            System.out.println("Landing");
            super.setWeight(super.getWeight() - 0.5);
        }
        else
        {
            System.out.println("I'm hungry.");
        }
    }
}
