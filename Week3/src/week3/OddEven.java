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
public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int users = 0;

        while(true) {
            users = input.nextInt();
            if (users == -1) {
                System.out.println("Odd number = " + odd + " Even number = " + even);
                return;
            }

            if (users % 2 != 0) {
                ++odd;
            } else {
                ++even;
            }
        }
    }
}
