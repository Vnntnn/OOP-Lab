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
public class Salary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int salary = (int) (float) 0;
        int bonus = (int) (float) 0;
        
        System.out.print("Please insert your name : ");
        String name = input.nextLine();
        
        System.out.print("Please insert your age : ");
        int age = input.nextInt();
        
        System.out.print("Please insert number of working days : ");
        double work = input.nextDouble();
        
        System.out.print("Please insert number of absent days : ");
        double absent = input.nextDouble();
        
        System.out.print("Please insert your body weight : ");
        double weight = input.nextDouble();
        
        System.out.println("Hi, " + name);
        
        if ((age >= 21) && (age <= 31)) {

            salary += (work * 300) - (absent * 50);

        } else if ((age  >= 31) && (age <= 40)) {

            salary += (work * 500) - (absent * 50);

        } else if ((age >= 41) && (age <= 50)) {

            salary += (work * 1000) - (absent * 25);

        } else if ((age >= 51) && (age <= 60)) {

            salary += (work * 3000);

        }
        
        if ((weight >= 10) && (weight < 61)) {
            
            bonus += salary + 5000;
    
        } else if ((weight >= 61) && (weight <= 90)) {
            
            bonus += salary + (5000 - ((weight - 60) * 10));
    
        }
        
        System.out.println("Your salary is " + salary + " bath" + "\n" + "Your salary and bonus is " + bonus + " Bath");
        
    }
}
