/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

/**
 *
 * @author User
 */
public class Programmer extends Employee{
    private int happiness;
    
    public void coding(String str)
    {
        this.setEnergy(this.getEnergy() - 30);
        happiness -= 30;

        if (this.getEnergy() >= 30)
        {
            System.out.println("Your code is " + str);
        }
        else
        {
            System.out.println("Error Error Error");
        }
    }
    
    public void coding(char str)
    {
        this.coding(Character.toString(str));
    }

    public int getHappiness()
    {
        return happiness;
    }
    
    public void setHappiness(int happiness)
    {
        this.happiness = happiness;
    }
}
 