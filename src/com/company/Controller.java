package com.company;

public class Controller {
    ModelLyaer modelLyaer = new DataBaseLyaer(); // тут можно поменять DataBaseLyaer, любой другой класс который хоти добавить
    View view = new ConsoleView();
    void execute(){
        Persone persone = modelLyaer.getPersone();
        view.showPersone(persone);
    }
}
