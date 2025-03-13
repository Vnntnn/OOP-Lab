/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit template
 */

package Book_and_Library;

public class Library {
    public Book book1;
    public Book book2;
    public Book book3;
    public String libraryName;

    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1:
                book1 = book;
                break;
            case 2:
                book2 = book;
                break;
            case 3:
                book3 = book;
                break;
        }
    }

    public void removeBook(int slot) {
        switch (slot) {
            case 1:
                book1 = null;
                break;
            case 2:
                book2 = null;
                break;
            case 3:
                book3 = null;
                break;
        }
    }

    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        System.out.println("");
        
        if (book1 != null) {
            book1.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
        System.out.println("");
        
        if (book2 != null) {
            book2.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
        System.out.println("");
        
        if (book3 != null) {
            book3.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }

    public void checkBookAvailability(int slot) {
        switch (slot) {
            case 1:
                if (book1 == null) {
                    System.out.println("Book in slot " + slot + " is not available.");
                    break;
                } else {
                    System.out.println(book1.title + " is available.");
                    break;
                }
            case 2:
                if (book1 == null) {
                    System.out.println("Book in slot " + slot + " is not available.");
                    break;
                } else {
                    System.out.println(book2.title + " is available.");
                    break;
                }
            case 3:
                if (book1 == null) {
                    System.out.println("Book in slot " + slot + " is not available.");
                    break;
                } else {
                    System.out.println(book2.title + " is available.");
                    break;
                }
        }
    }

    public void updateBookPrice(int slot, double newPrice) {
        switch (slot) {
            case 1:
                if (book1 == null) {
                    System.out.println("No book in this slot.");
                    break;
                } else {
                    book1.updatePrice(newPrice);
                    System.out.println("Updated price of " + book1.title + " to $" + newPrice + ".");
                    break;
                }
            case 2:
                if (book2 == null) {
                    System.out.println("No book in this slot.");
                    break;
                } else {
                    book2.updatePrice(newPrice);
                    System.out.println("Updated price of " + book2.title + " to $" + newPrice + ".");
                    break;
                }
            case 3:
                if (book3 == null) {
                    System.out.println("No book in this slot.");
                    break;
                } else {
                    book3.updatePrice(newPrice);
                    System.out.println("Updated price of " + book3.title + " to $" + newPrice + ".");
                    break;
                }
        }
    }

    public void printBookDetails(Book book) {
        if (book == null) {
            System.out.println("No book in this slot.");
        } else {
            book.printDetails();
        }
    }
    
//    public static void main(String[] args) {
//        Book book1 = new Book();
//        book1.title = "Java Programming";
//        book1.price = 450;
//        book1.publisher = "Head First";
//        book1.yearPublished = 2006;
//        book1.isAvailable = false;
//        book1.author = "John Smith";
//
//        Book book2 = new Book();
//        book2.title = "Python Programming";
//        book2.price = 225;
//        book2.publisher = "KM";
//        book2.yearPublished = 2020;
//        book2.isAvailable = true;
//        book2.author = "Elon Potter";
//
//        Library lib = new Library();
//        lib.libraryName = "IT Library";
//        lib.addBook(book2, 1);
//        lib.addBook(book1, 3);
//
//        lib.updateBookPrice(2, 1000);
//        lib.updateBookPrice(3, 320);
//
//        lib.printLibraryDetails();
//    }
}
