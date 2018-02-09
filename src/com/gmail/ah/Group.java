package com.gmail.ah;

import java.util.Arrays;
import java.util.Comparator;

public class Group {
    private Student[] students = new Student[10];
    public Group() {
        super();
    }

    public Student[] getStudents() {
        return students;
    }

    public int numberOfStudents() {
        int counter = 0;
        for (Student one : students) {
            if (one != null) {
                counter++;
            }
        }
        return counter;
    }

    public void addStudent(Student student) throws MyException{
        for (int i = 0; i < students.length; i++) {
            if (this.numberOfStudents() >= 10) {
                throw new MyException();
            } else {
                if (students[i] == null) {
                    students[i] = student;
                    break;
                }
            }
        }
    }

    public void deleteStudent(String lastname) {
        for (int j = 0; j < students.length; j++) {
            if (students[j] != null && students[j].getLastname().equals(lastname)) {
                students[j] = null;
                break;
            }
        }

    }

    public Student searchStudent(String lastname) {
        for (Student one : students) {
            if (one != null && one.getLastname().equals(lastname)) {
                return one;
            }
        }
        System.out.println("There is no such student");
        return null;

    }

    public void sortStudents() {
        Student[] arr = new Student[this.numberOfStudents()];
        int i = 0;
        for (Student one : students) {
            if (one != null) {
                arr[i++] = one;
            }
        }
        Arrays.sort(arr, new Comparator<Student>() {

            @Override
            public int compare(Student st1, Student st2) {
                return st1.getLastname().compareTo(st2.getLastname());
            }
        });
        students = Arrays.copyOf(arr, 10);
    }

    @Override
    public String toString() {
        this.sortStudents();
        StringBuilder sb = new StringBuilder();
        for (Student one : students) {
            if (one != null) {
                sb.append(one);
                sb.append(System.lineSeparator());
            }
        }
        return sb.toString();
    }
}









