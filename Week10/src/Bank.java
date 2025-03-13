/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class Bank {
    private Account acct[];
    private int numAcct;
    
    public Bank() 
    {
        this.acct = new Account[10];
        this.numAcct = 0;
    }
    
    public void addAccount(Account ac) 
    {
        if (numAcct < 10) {
            acct[numAcct] = ac;
            numAcct++;
        }
    }
    
    public Account getAccount(int index)
    {
        return acct[index];
    }

    public int getNumAccount()
    {
        return numAcct;
    }
}
