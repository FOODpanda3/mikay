/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.transfer.between.classrooms;

/**
 *
 * @author Jassen
 */
public class Student {

    private String name;
    private int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name:" + name + "ID:" + id);
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return id;
    }
}
