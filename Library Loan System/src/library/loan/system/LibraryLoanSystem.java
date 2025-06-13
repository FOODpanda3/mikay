/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package library.loan.system;

/**
 *
 * @author Jassen
 */
public class LibraryLoanSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibraryClass library = new LibraryClass();
        
        BookClass book1 = new BookClass("Harry Potter", "J.K. Rowling", 5);
        BookClass book2 = new BookClass("The Hobbit", "J.R.R. Tolkien", 3);
        BookClass book3 = new BookClass("1984", "George Orwell", 2);

        library.addBookClass(book1);
        library.addBookClass(book2);
        library.addBookClass(book3);
        
        library.displayLibrary();
        
        System.out.println("\nAttempting to loan 'Harry Potter' (2 copies)...");
        library.loanBook(book1, 2);
        library.displayLibrary();

        System.out.println("\nReturning 'Harry Potter' (1 copy)...");
        library.returnBook(book1, 1);
        library.displayLibrary();
    }

}
