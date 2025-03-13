/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
public class Customer {
    private String firstName;
    private String lastName;
    private CheckingAccount acct;
    
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public CheckingAccount getAcct() {
        return acct;
    }

    public void setAcct(CheckingAccount acct) {
        this.acct = acct;
    }

    
    public Customer(String firstName, String lastName, CheckingAccount acct)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.acct = acct;
    }
    
    public Customer(String firstName, String lastName)
    {
        this(firstName, lastName, null);
    }
    
    public Customer()
    {
        this("", "", null);
    }
    
    @Override
    public String toString()
    {
        if (this.getAcct() == null)
        {
            return this.getFirstName() + " "+ this.getLastName() + " doesn’t have account.";
        }
        else
        {
            return "The " + this.getFirstName() + " account has " + this.acct.getBalance() + " baht and " + this.acct.getCredit() + " credits.";
        }
    }
    
    public boolean equals(Customer c)
    {
        return this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName());
    }
}
