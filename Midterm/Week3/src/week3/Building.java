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
public class Building {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("กรุณาระบุความสูงตึก: ");
        int height = input.nextInt();

        for(int i = 1; i <= height; i++) {
            System.out.print("#-#-#-#-#");
            System.out.println("");
        }

    }
}
