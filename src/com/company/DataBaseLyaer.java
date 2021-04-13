package com.company;

public class DataBaseLyaer implements ModelLyaer{
    @Override
    public Persone getPersone() {
        return new Persone("Lena", "22"); // тут происходит подключение к базе данных и забираем данные.
        // для примера просто взял 1 единицу чтоб посмотреть как работает
    }
}
