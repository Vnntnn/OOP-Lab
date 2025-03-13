/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public abstract class Food {
    protected String name;

    public Food()
    {
        this("");
    }

    public Food(String name)
    {
        this.name = name;
    }

    public abstract int getPower();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
