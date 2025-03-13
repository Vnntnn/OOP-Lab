/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class Customer {
    // Lab 10.2
//    private String firstName;
//    private String lastName;
//    private Account acct[];
//    private int numOfAccount;
//    
//    public Customer(String firstName, String lastName)
//    {
//        this.firstName = firstName;
//        this.lastName = lastName;
//        acct = new Account[5];
//    }
//    
//    public Customer()
//    {
//        this("", "");
//    }
//    
//    public String getFirstName() 
//    {
//        return firstName;
//    }
//
//    public void setFirstName(String firstName) 
//    {
//        this.firstName = firstName;
//    }
//
//    public String getLastName() 
//    {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) 
//    {
//        this.lastName = lastName;
//    }
//    
//    public Account getAccount(int index)
//    {
//        return acct[index];
//    }
//
//    public int getNumOfAccount() 
//    {
//        return numOfAccount;
//    }
//
//    public void addAccount(Account acct) 
//    {
//        if (numOfAccount < 5) {
//            this.acct[numOfAccount] = acct;
//            numOfAccount++;
//        }
//    }
//    
//    @Override
//    public String toString()
//    {
//        return this.firstName + " " + this.lastName + " has " + this.getNumOfAccount() + " accounts.";
//    }
//    
//    public boolean equals(Customer c)
//    {
//        if ((this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName())) == true)
//        {
//            return true;
//        }
//        else
//        {
//            return false;
//        }
//    }

    // Lab 10.3
    private String firstName;
    private String lastName;
    private ArrayList acct;
    private int numOfAccount;
    
    public Customer(String firstName, String lastName)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        acct = new ArrayList();
    }
    
    public Customer()
    {
        this("", "");
    }
    
    public String getFirstName() 
    {
        return firstName;
    }

    public void setFirstName(String firstName) 
    {
        this.firstName = firstName;
    }

    public String getLastName() 
    {
        return lastName;
    }

    public void setLastName(String lastName) 
    {
        this.lastName = lastName;
    }
    
    public Account getAccount(int index)
    {
        return (Account) acct.get(index);
    }

    public int getNumOfAccount() 
    {
        return acct.size();
    }

    public void addAccount(Account acct) 
    {
        this.acct.add(acct);
        numOfAccount++;
    }
    
    @Override
    public String toString()
    {
        return this.firstName + " " + this.lastName + " has " + this.getNumOfAccount() + " accounts.";
    }
    
    public boolean equals(Customer c)
    {
        if ((this.getFirstName().equals(c.getFirstName()) & this.getLastName().equals(c.getLastName())) == true)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
