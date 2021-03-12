package com.company;

public class DoubleCheckedLockingSingletonV {
    private static volatile DoubleCheckedLockingSingletonV instance;
    private DoubleCheckedLockingSingletonV() {};


    public static DoubleCheckedLockingSingletonV getInstance() {
        if (instance == null)
            synchronized (DoubleCheckedLockingSingletonV.class) {
                if (instance == null)
                    instance = new DoubleCheckedLockingSingletonV();
            }
        return instance;
    }
}
//Создаём объект с ключем словом volatile
//вызываем метод
//если объект не создан, то синхронизируем объект класса
//если не существует, то создаём
