/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */
import java.util.*;

public class ExceptionDemo extends Exception {
    private double x1, x2, x3, a, b, c;
    public static void main(String[] args) {
    try {
        Double a = Double.parseDouble(args[0]);
        Double b = Double.parseDouble(args[1]);
        Double c = Double.parseDouble(args[2]);
        Double x1 = (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
        Double x2 = (-b - Math.sqrt(b * b - (4 * a* c))) / (2 * a);
        System.out.println("x1 : " + x1);
        System.out.println("x2 : " + x2);
    }catch (NumberFormatException e){
        System.out.println("Please input data in number format only.");
    }catch (IndexOutOfBoundsException e){
        System.out.println("Please enter 3 numbers as a, b, and c respectively.");
    }
    }
}
