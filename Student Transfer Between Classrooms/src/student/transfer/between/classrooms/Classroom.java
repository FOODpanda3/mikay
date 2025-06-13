package student.transfer.between.classrooms;


import java.util.ArrayList;
import student.transfer.between.classrooms.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jassen
 */
public class Classroom {

    private String ClassName;
    private ArrayList<Student> Students;

    public Classroom(String ClassName) {
        this.ClassName = ClassName;
        this.Students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        Students.add(student);
        System.out.println(student.getName() + "Has been Added" + ClassName);
    }

    public void removeStudent(Student student) {
        if (Students.remove(student)) {
            System.out.println(student.getName() + " has been removed from " + ClassName);
        } else {
            System.out.println(student.getName() + " is not found in " + ClassName);
        }
    }

    public void displayStudents() {
        System.out.println("Students in " + ClassName + ":");
        if (Students.isEmpty()) {
            System.out.println("No students in this classroom.");
        } else {
            for (Student student : Students) {
                student.displayInfo();
            }
        }
        System.out.println();
    }

    public void transferStudent(Student student, Classroom newClassroom) {
        if (Students.contains(student)) {
            removeStudent(student);
            newClassroom.addStudent(student);
            newClassroom.addStudent(student);
            System.out.println(student.getName() + " has been transferred to " + newClassroom.getClassName() + "\n");

        } else {
            System.out.println(student.getName() + " is not in " + ClassName + " and cannot be transferred.");
        }
    }

    public String getClassName() {
        return ClassName;
    }
}
