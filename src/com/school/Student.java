package com.school;
public class Student extends Person {
    // private static int nextStudentIdCounter= 1; // static variable to keep track of the next student ID
    // int studentId;
    // String name;
    private String gradeLevel;

    public Student(String name, String gradeLevel) {
        // this.studentId = nextStudentIdCounter++;
        // this.name = name;
        super(name); // Call the constructor of the superclass Person
        this.gradeLevel = gradeLevel;
    }
//    public int getStudentId() {
//        return studentId;
//    }

//     public String getName() {
//         return name;
//     }

public String getGradeLevel() {
        return gradeLevel;
    }
@Override
    public void displayDetails() {
        super.displayDetails(); // Call the displayDetails method of the superclass Person
        System.out.println(", Grade Level: " + this.gradeLevel + " (Role: Student)");
    }
}
