/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week3;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class newTangentLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please insert a number : ");
        int num = input.nextInt();
        
        for (int i = 0; i < num; i++) {
            
            if ((i % 5) == 0) {
                System.out.println("");
            }
            
            System.out.print("|");
            
        }
        
        System.out.println("");
        
    }
}
