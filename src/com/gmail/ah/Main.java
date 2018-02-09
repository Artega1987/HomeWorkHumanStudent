package com.gmail.ah;


import java.lang.String;


public class Main {
    public static void main(String[] args) {
        Student st1 = new Student ("Arseniy","Haevskiy",21, "Male", "informatics",4);
        Student st2 = new Student ("Max","Machin",22, "Male", "informatics",4);
        Student st3 = new Student ("Alena","Gura",20, "FaMale", "informatics",4);
        Student st4 = new Student ("Yaroslava","Mitrovksa",21, "FaMale", "informatics",4);
        Student st5 = new Student ("Evgeniy","Semko",20, "Male", "informatics",4);
        Student st6 = new Student ("Uriy","Nikylin",21, "Male", "informatics",4);
        Student st7 = new Student ("Dmitriy","Pankin",21, "Male", "informatics",4);
        Student st8 = new Student ("Andrey","Pavlov",25, "Male", "informatics",4);
        Student st9 = new Student ("Aleksandr","Stolenskiy",21, "Male", "informatics",4);
        Student st10= new Student ("Victor","Lisin",22, "Male", "informatics",4);
        Student st11= new Student ("Oleg","Balkonskiy",29, "Male", "informatics",4);
        Group grp1 = new Group ();
        try {
            grp1.addStudent(st1);
            grp1.addStudent(st2);
            grp1.addStudent(st3);
            grp1.addStudent(st4);
            grp1.addStudent(st5);
            grp1.addStudent(st6);
            grp1.addStudent(st7);
            grp1.addStudent(st8);
            grp1.addStudent(st9);
            grp1.addStudent(st10);
            grp1.addStudent(st11);
        } catch (MyException e) {
            e.printStackTrace();
        }

        System.out.println(grp1);
        try {
            grp1.addStudent(st11);
        } catch (MyException e) {
            e.printStackTrace();
        }
        grp1.deleteStudent("Balkonskiy");
        System.out.println(grp1);
        System.out.println(grp1.searchStudent("Lisin"));

    }
}


