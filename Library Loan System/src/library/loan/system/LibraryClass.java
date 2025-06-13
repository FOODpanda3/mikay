/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.loan.system;

import java.util.ArrayList;

/**
 *
 * @author Jassen
 */
public class LibraryClass {

    private final ArrayList<BookClass> books;
    private String title;

    public LibraryClass() {
        books = new ArrayList<>();
    }

    public void addBookClass(BookClass book) {
        books.add(book);
    }

    public void loanBook(BookClass book, int loanCount) {
        if (books.contains(book)) {
            if (book.getCopies() >= loanCount) {
                book.decrementCopies(loanCount);
            } else {
                System.out.println("Not enough copies available to loan.");
            }
        } else {
            System.out.println("Book not found.");
        }
    }

    public void returnBook(BookClass book, int returnCount) {
        if (books.contains(book)) {
            book.incrementCopies(returnCount);
        } else {
            System.out.println("Book not found.");
        }
    }
  

    public void displayLibrary() {
        System.out.println("Library Inventory:");
        for (BookClass book : books) {
            book.displayInfo();
            System.out.println();
        }
    }
}
