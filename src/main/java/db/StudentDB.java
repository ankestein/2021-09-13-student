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

    public void addStudent(Student student){
        Student[] updatedStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            updatedStudents[i] = students[i];
        }
        updatedStudents[updatedStudents.length - 1] = student;
        students = updatedStudents;
    }

    public void remove(int studentId) {
        if (!containsId(studentId)) {
            return;
        }
        boolean removed = false;
        Student[] updatedStudents = new Student[students.length - 1];

        for (int i = 0; i < updatedStudents.length; i++) {
            Student student = students[i];
            if (student.getId() == studentId) {
                removed = true;
            }
            int readIndex;
            if (removed) {
                readIndex = i + 1;
            } else {
                readIndex = i;
            }
            updatedStudents[i] = students[readIndex];
        }
        students = updatedStudents;
    }

    private boolean containsId(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
