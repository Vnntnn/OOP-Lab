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
public class Tax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double salary = input.nextDouble();
        
        if (salary >  50000.00) {
            System.out.println(salary * 0.1);
        } else {
            System.out.println(salary * 0.05);
        }
    }
}
