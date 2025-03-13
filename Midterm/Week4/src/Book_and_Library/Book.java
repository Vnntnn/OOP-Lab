/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Book_and_Library;

public class Book {
    public String title;
    public String author;
    public String publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;

    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
        if (this.isAvailable) {
            System.out.println("Available: Yes");
        } else if (!isAvailable) {
            System.out.println("Available: No");
        }

    }

    public void updatePrice(double newPrice) {
        price = newPrice;
    }

    public void markAsUnavailable() {
        isAvailable = false;
    }

    public void markAsAvailable() {
        isAvailable = true;
    }

    public boolean isPublishedAfter(int year) {
        return year < yearPublished;
    }

//    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.title = "Java Programming";
//        book1.price = 450;
//        book1.publisher = "Head First";
//        book1.yearPublished = 2006;
//        book1.isAvailable = false;
//        book1.author = "John Smith";
//        book1.printDetails();
//        System.out.println("-------------");
//        book1.updatePrice(250);
//        book1.markAsAvailable();
//        book1.printDetails();
//        System.out.println(book1.isPublishedAfter(2000));
//    }
}
