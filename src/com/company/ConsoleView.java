package com.company;

public class ConsoleView implements View{

    @Override
    public void showPersone(Persone persone) {
        System.out.println("Name: " + persone.getName() + ", age: " + persone.getAge());
    }
}
