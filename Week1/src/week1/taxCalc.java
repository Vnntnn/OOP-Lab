/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class taxCalc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        double x = input.nextDouble() ;
        System.out.print((x * 0.07) + x);
    }
}
