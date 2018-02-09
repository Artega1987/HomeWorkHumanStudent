package com.gmail.ah;

public class Human {
    private String name;
    private String lastname;
    private int age;
    private String gender;


    public Human() {
    }

    public Human(String name, String lastname, int age, String gender) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return " lastname=" + lastname + ", age=" + age + ", gender=" + gender + "]";
    }

}


