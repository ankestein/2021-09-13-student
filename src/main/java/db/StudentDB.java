package db;

import model.Student;

import java.util.*;

public class StudentDB {
    private Map<Integer, Student> students = new HashMap<>();

    // constructor
    public StudentDB(List<Student> students) {
        add(students);
    }

    public List<Student> list() {
        return new ArrayList<>(students.values());
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }


    public Student randomStudent() {
        double random = Math.random();
        int randomIndex = (int) (random * students.size());
        return students.get(randomIndex);
    }

    public void add(Student student) {
        students.put(student.getId(), student);
    }

    public void add(List<Student> students) {
        for (Student student : students) {
            add(student);
        }
    }

    public void remove(int studentId) {
        students.remove(studentId);
    }

}
