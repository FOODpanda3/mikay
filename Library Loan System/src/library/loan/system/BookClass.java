/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package library.loan.system;

/**
 *
 * @author Jassen
 */
public class BookClass {

    private String title;
    private String author;
    private int copies;

    public BookClass(String title, String Author, int copies) {
        this.title = title;
        this.author = author;
        this.copies = copies;
    }

    public void displayInfo() {
        System.out.println("Title:" + title);
        System.out.println("Author:" + author);
        System.out.println("Copies:" + copies);
    }

    public void decrementCopies(int count) {
        if (count > 0 && count <= copies) {
            copies -= count;
            System.out.println("Withdrawn:" + count);
        } else {
            System.out.println("Not Enough Copies");
        }
    }

    public void incrementCopies(int count) {
        if (count > 0) {
            copies += count;
            System.out.println("Returned: " + count);
        }
    }

    public String getTitle() {
        return title;
    }

    public int getCopies() {
        return copies;
    }
}
