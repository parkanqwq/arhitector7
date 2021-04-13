package com.company;

public class Persone {

    private String name;
    private String age;

    public Persone(String name, String age) { //для примера
        this.name = name;
        this.age = age;
    }

    public Persone(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
