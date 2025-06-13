/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package student.transfer.between.classrooms;

/**
 *
 * @author Jassen
 */
public class studenttest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Classroom classroomA = new Classroom("Class A");
        Classroom classroomB = new Classroom("Class B");

        Student student1 = new Student("Ulyss", 101);
        Student student2 = new Student("Daryl", 102);
        Student student3 = new Student("Rogxxx", 103);

        classroomA.addStudent(student1);
        classroomA.addStudent(student2);
        classroomA.addStudent(student3);

        System.out.println("\nTransfering:");
        classroomA.displayStudents();
        classroomB.displayStudents();

        classroomA.transferStudent(student2, classroomB);

        System.out.println("\nTransfered:");
        classroomA.displayStudents();
        classroomB.displayStudents();

    }

}
