package db;

import model.Student;

import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    // constructor
    public StudentDB(Student[] students){
        this.students = students;
    }

    public Student[] list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students = " +
                Arrays.toString(students) +
                "}";
    }

    public Student getRandomStudent(){
        int randomIndex = (int) (Math.random() * students.length);
        return students[randomIndex];
    }

}
