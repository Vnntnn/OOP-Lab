/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fraction;

/**
 *
 * @author User
 */
public class Fraction {
    public int topN;
    public int btmN;

    public String toFraction() {
        return topN + "/" + btmN;
    }

    public String toFloat() {
        return ((topN * 1.00) / (btmN * 1.00)) + "";
    }

    public void addFraction(Fraction f) {
        if (btmN == f.btmN) {
            topN += f.topN;
        } else {
            topN = topN * f.btmN + f.topN * btmN;
            btmN *= f.btmN;
        }

    }
    
    public boolean myEquals(Fraction x) {
        return ((topN * 1.00 / btmN * 1.00) == (x.topN * 1.00 / x.btmN * 1.00));
    }
    
    public void LowestTermFrac() {
        for (int divide = Math.min(topN, btmN); divide > 1; divide--) {
            while (topN % divide == 0 && btmN % divide == 0) {
                topN /= divide;
                btmN /= divide;
            }
        }
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction();
        f1.topN = 1;
        f1.btmN = 3;

        Fraction f2 = new Fraction();
        f2.topN = 4;
        f2.btmN = 16;

        Fraction f3 = new Fraction();
        f3.topN = 5;
        f3.btmN = 15;

        System.out.println(f1.toFloat());
        System.out.println(f2.toFloat());
        System.out.println(f3.toFloat());

        System.out.println("f1 is equal to f2 >> " + f1.myEquals(f2));
        System.out.println("f1 is equal to f3 >> " + f1.myEquals(f3));

        System.out.println("Before : " + f2.toFraction());
        f2.LowestTermFrac();
        System.out.println("After : " + f2.toFraction());
    }
}
