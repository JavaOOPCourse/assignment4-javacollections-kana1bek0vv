package service;

import model.Student;
import java.util.ArrayList;
import java.util.Iterator;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void initializeStudents() {
        // TODO: Add at least 5 students
        students.add(new Student(1, "Эрбол", 3.5));
        students.add(new Student(2, "Эмил", 1.8));
        students.add(new Student(3, "Искендер", 4.2));
        students.add(new Student(4, "Эля", 2.7));
        students.add(new Student(5, "Рабия", 1.5));
    }

    public void removeLowGPA() {
        // TODO: Remove students with GPA < 2.0
        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getGpa() < 2.0) {
                students.remove(i);
                i--;
            }
        }

        System.out.println("Студенты с GPA < 2.0 удалены.");
    }

    public void findHighestGPA() {
        // TODO: Find and print student with highest GPA
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
            return;
        }

        Student topStudent = students.get(0);

        for (Student s : students) {
            if (s.getGpa() > topStudent.getGpa()) {
                topStudent = s;
            }
        }

        System.out.println("Студент с самым высоким GPA:");
        System.out.println(topStudent);
    }

    public void insertAtIndex() {
        // TODO: Insert new student at index 2
        if (students.size() < 2) {
            System.out.println("Недостаточно студентов для вставки.");
            return;
        }

        Student newStudent = new Student(99, "Новый студент", 3.9);
        students.add(2, newStudent);

        System.out.println("Студент добавлен на индекс 2.");
    }

    public void printStudents() {
        // TODO: Print using Iterator
        if (students.isEmpty()) {
            System.out.println("Список студентов пуст.");
            return;
        }

        System.out.println("Список студентов:");

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
