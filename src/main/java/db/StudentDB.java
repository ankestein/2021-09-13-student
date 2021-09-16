package db;

import model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {
    private List<Student> students;

    // constructor
    public StudentDB(List<Student> students){
        this.students = new ArrayList<>(students);
    }

    public List<Student> list() {
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

    public void removeStudent(int studentId) {
        Student student = findById(studentId);
        if (student == null) {
            return;
        }
        students.remove(student);
    }

    private Student findById(int id){
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
         }
        return null;
    }


}
