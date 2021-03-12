package com.company;

public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton () {};


    public static LazyInitializedSingleton getInstance() {

        if (instance == null) //если нету
            instance = new LazyInitializedSingleton(); //создаём новый

        return instance; //если существует, то возвращаем
    }
}

