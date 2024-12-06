/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;
import java.util.Scanner;
/**
 *
 * @author User
 */
public class timeConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;
        int hour = input.nextInt() ;
        int min = input.nextInt() ;
        System.out.println(((hour * 60) + min) * 60);
    }
}
