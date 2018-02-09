package com.gmail.ah;

public class Student extends Human {
        private String group;
        private int kurs;

    public Student() {
        super();
    }

    public Student(String name, String lastname, int age, String gender, String group, int kurs) {
        super(name, lastname, age, gender);
        this.group= group;
        this.kurs = kurs;
    }

    public String getFac() {
        return group;
    }

    public void setFac(String fac) {
        this.group = fac;
    }

    public int getKurs() {
        return kurs;
    }

    public void setKurs(int kurs) {
        this.kurs = kurs;
    }


    @Override
    public String toString() {
        return "Student [group=" + group + ", faculty=" + kurs + super.toString();
    }
}



