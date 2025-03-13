/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class CheckingAccount extends Account{
    private double credit;
    
    public CheckingAccount()
    {
        super(0, "");
        this.setCredit(0.00);
    }
    
    public CheckingAccount(double balance, String name, double credit)
    {
        super(balance, name);
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }

    public void setCredit(double credit) {
        if (credit < 0)
        {
            System.out.println("Input number must be a positive integer.");
        }
        else
        {
            this.credit = credit;
        }
    }
    
    @Override
    public void withdraw(double a)
    {
        if (a < 0)
        {
            System.out.println("Input number must be a positive integer.");
        }
        else {
            if ((super.getBalance() - a) >= 0)
            {
                super.setBalance(super.getBalance() - a);
                System.out.println(a + " baht is withdrawn from " + super.getName() + " and your credit balance is " + this.getCredit() + ".");
            }
            else if ((super.getBalance() - a + this.getCredit()) >= 0 ) {
                super.setBalance(0);
                this.setCredit(this.getCredit() - a);
                System.out.println(a + " baht is withdrawn from " + super.getName() + " and your credit balance is " + this.getCredit() + ".");
            }
            else
            {
                System.out.println("Not enough money!");
            }
        }
    }
    public void withdraw(String a)
    {
        this.withdraw(Double.parseDouble(a));
    }
    
    @Override
    public String toString()
    {
        return "The " + super.getName() + " account has " + super.getBalance() + " baht and " + this.getCredit() + " credits.";
    }
}
