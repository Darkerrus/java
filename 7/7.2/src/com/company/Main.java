package com.company;

class Subsystem1 {
    public void start() {
        System.out.println("Subsystem1 start working");
    }
}

class Subsystem2 {
    public void start() {
        System.out.println("Subsystem2 start working");
    }
}

class Subsystem3 {
    public void start() {
        System.out.println("Subsystem3 start working");
    }
}



class Facade {
    private final Subsystem1 subsystem1;
    private final Subsystem2 subsystem2;
    private final Subsystem3 subsystem3;

    public Facade() {
        subsystem1 = new Subsystem1();
        subsystem2 = new Subsystem2();
        subsystem3 = new Subsystem3();
    }

    public void init() {
        subsystem1.start();
        subsystem2.start();
        subsystem3.start();
    }
}




public class Main {

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.init();
    }
}
