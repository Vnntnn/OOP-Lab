/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Owner {
    protected final String name;
    protected Animal animal;
    
    public Owner()
    {
        this("", null);
    }
    
    public Owner(String name)
    {
        this(name, null);
    }
    
    public Owner(Animal animal)
    {
        this("", animal);
    }
    
    public Owner(String name, Animal animal)
    {
        this.name = name;
        this.animal = animal;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public String getName() {
        return name;
    }
        
    public void feedFood(Food f)
    {
        animal.eat(f);
    }
    
    @Override
    public String toString()
    {
        return "Owner : name = " + this.getName() + ", Animal : name = " + this.getAnimal().getName() + ", power = " + this.getAnimal().getPower() + ", age = " + this.getAnimal().getAge();
    }
    
    public void protectOwnerFrom(Animal a)
    {
        if (this.animal instanceof Dog)
        {
            ((Dog)animal).kick(a);
        }
        else
        {
            ((Pigeous)animal).wingAttack(a);
        }
    }
}
