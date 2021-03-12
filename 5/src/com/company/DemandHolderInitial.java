package com.company;

public class DemandHolderInitial {
    private DemandHolderInitial(){};

    private static final DemandHolderInitial initial = new DemandHolderInitial();

    public static DemandHolderInitial getInstance(){

        return DemandHolderInitial.initial;
    }
}
// Объект инициализируется при первом вызове метода getInstance(),
// с ленивой инициализацией, но невозможно использовать для нестатических полей класса
