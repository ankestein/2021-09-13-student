package db;

import model.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    private ArrayList<Student> students;

    // constructor
    public StudentDB(ArrayList<Student> students){
        this.students = students;
    }

    public ArrayList<Student> list() {
        return students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students = " +
                students +
                "}";
    }

    public Student getRandomStudent(){
        int randomIndex = (int) (Math.random() * students.size());
        return students.get(randomIndex);
    }


    public void addStudent(Student student){
        students.add(student);

    }


}
