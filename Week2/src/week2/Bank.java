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
public class Bank {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Input your money : ");
        double money = input.nextDouble();
        
        System.out.print("Input your account type (Please type A B C or X in uppercase) : ");
        char type = input.next().charAt(0);
        
        switch (type) {
            case 'A', 'C' ->  { 
                {
                    System.out.println("Your total money in one year = " + ((money * 0.015) + money));
                }
            }
            case 'B' -> {
                    System.out.println("Your total money in one year = " + ((money * 0.02) + money));
            }
            case 'X' -> {
                    System.out.println("Your total money in one year = " + ((money * 0.05) + money));
            }
            default -> System.out.println("EEEEIIII");
        }
    }
}
