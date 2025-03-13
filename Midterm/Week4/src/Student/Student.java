/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Student;

/**
 *
 * @author User
 */
public class Student {
    public double fScore;
    public double mScore;
    public String name;

    public Student() {
    }

    public void showGrade() {
        double s = this.mScore * 0.4 + this.fScore * 0.4 + (double)20.0F;
        if (s >= (double)80.0F) {
            System.out.println("Your grade is A");
        } else if (s >= (double)70.0F) {
            System.out.println("Your grade is B");
        } else if (s >= (double)60.0F) {
            System.out.println("Your grade is C");
        } else if (s >= (double)50.0F) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is F");
        }

    }

    public static void main(String[] args) {
        Student s = new Student();
        s.mScore = 80;
        s.fScore = 80;
        s.showGrade();
    }
}
