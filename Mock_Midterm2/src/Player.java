/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Player {
    private final String name;
    private final int attackDamage = 2;
    private Houses houses;
    private int hp = 20; 
    private int mana = 50; 
    
    public Player()
    {
        name = "";
        houses = null;
    }
    
    public Player(String name)
    {
        this.name = name;
        houses = null;
    }
    
    public Player(String name, int hp)
    {
        this.name = name;
        this.hp = hp;
        houses = null;
    }

    public Houses getHouses() {
        return houses;
    }

    public void setHouses(Houses houses) {
        this.houses = houses;
    }

    public int getHP() {
        return hp;
    }

    public void setHP(int hp) {
        if (hp < 0)
        {
            this.hp = 0;
        }
        else if (hp >= 20)
        {
            this.hp = 20;
        }
        else
        {
            this.hp = hp;
        }
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        if (mana < 0)
        {
            this.mana = 0;
        }
        else if (mana > 50)
        {
            this.mana = 50;
        }
        else {
            this.mana = mana;
        }
    }

    public String getName() {
        return name;
    }

    public int getAttackDamage() {
        return attackDamage;
    }
    
    @Override
    public String toString()
    {
        return "[Player] : " + this.getName() + " HP: " + this.getHP() + " Mana: " + this.getMana() + " || " + "[House] : " + this.getHouses();
    }
    
    public boolean equals(Player player)
    {
        return this.name.equals(player.getName()) & this.houses.equals(player.getHouses());
    }
    
    public void attack(Player target, Spell spell)
    {
        if (houses instanceof Gryffindor)
        {
            ((Gryffindor)houses).attackSpell(this, target, spell);
        }
        else
        {
            ((Hufflepuff)houses).attackSpell(this, target, spell);
        }
        if (target.getHP() == 0)
        {
            System.out.println("[DEAD]: " + target.getName() + " was killed by " + this.getName());
        }
    }

    public void protectFromPlayer (Player target)
    {
        if (houses instanceof Gryffindor)
        {
            ((Gryffindor)houses).defense(this, target);
        }
        else
        {
            ((Hufflepuff)houses).defense(this, target);
        }
    }
}
