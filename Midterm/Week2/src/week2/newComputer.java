/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week2;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class newComputer {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("please insert your monitor size 38 or 43 only");
        int monitor = input.nextInt();
        
        System.out.println("Do you want DVD-ROM? 1 is Yes / 0 is No");
        int disc = input.nextInt();
        
        System.out.println("Do you want printer? 1 is Yes / 0 is No");
        int printer = input.nextInt();
        
        double total = 375.99;
        
        System.out.println("======= Your order =======");
        System.out.println("* computer >>> 375.99$");
        
        if (monitor == 38) {
            
            total += 75.99;
            System.out.println("* 38'Monitor >>> 75.99$");
            
        } else {
            
            total += 99.99;
            System.out.println("* 43'Monitor >>> 99.99$");
        
        }
        
        if (disc == 1) {
            
            total += 65.99;
            System.out.println("* DVD-Rom >>> 65.99$");
            
        }
        
        if (printer == 1) {
            
            total += 125.00;
            System.out.println("* Printer >>> 125.00$");
            
        }
        
        System.out.println("======= Total price >>> " + total + " =======");
        
    }
}
