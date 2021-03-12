package com.company;

abstract class Dog {
    void PickUpADog () {
        System.out.println("За собакой пошли, сейчас принесут...");
    }
}

enum dogBreed {
    SHEPHERD,
    BULLDOG,
    POODLE,
    ALABAI
}

class SmallShepherdDog extends Dog {};
class SmallBulldogDog extends Dog {};
class SmallPoodleDog extends Dog {};
class SmallAlabaiDog extends Dog {};

class MediumShepherdDog extends Dog {};
class MediumBulldogDog extends Dog {};
class MediumPoodleDog extends Dog {};
class MediumAlabaiDog extends Dog {};

class BigShepherdDog extends Dog {};
class BigBulldogDog extends Dog {};
class BigPoodleDog extends Dog {};
class BigAlabaiDog extends Dog {};


abstract class DogShelter {
    void orderDog (dogBreed breed) {
        Dog dog = createDog(breed);
        dog.PickUpADog();
        switch (breed) {
            case SHEPHERD:
                System.out.println("Вот ваша оварка, позаботьтесь о ней");
                break;
            case BULLDOG:
                System.out.println("Вот ваш бульдог, позаботьтесь о нём");
                break;
            case POODLE:
                System.out.println("Вот ваш пудель, позаботьтесь о нём");
                break;
            case ALABAI:
                System.out.println("Вот ваш алабай, позаботьтесь о нем");
                break;
        }
    }
    abstract Dog createDog(dogBreed breed);
}

class SmallDogShelter extends DogShelter {

    @Override
    Dog createDog(dogBreed breed) {
        System.out.println("Вы зашли в отдел маленьких пород собак");
        Dog dog = null;
        switch (breed) {
            case SHEPHERD:
                dog = new SmallShepherdDog();
                break;
            case BULLDOG:
                dog = new SmallBulldogDog();
                break;
            case POODLE:
                dog = new SmallPoodleDog();
                break;
            case ALABAI:
                dog = new SmallAlabaiDog();
                break;
        }
        return dog;
    }
}

class MediumDogShelter extends DogShelter {

    @Override
    Dog createDog(dogBreed breed) {
        System.out.println("Вы зашли в отдел средних пород собак");
        Dog dog = null;
        switch (breed) {
            case SHEPHERD:
                dog = new MediumShepherdDog();
                break;
            case BULLDOG:
                dog = new MediumBulldogDog();
                break;
            case POODLE:
                dog = new MediumPoodleDog();
                break;
            case ALABAI:
                dog = new MediumAlabaiDog();
                break;
        }
        return dog;
    }
}

class BigDogShelter extends DogShelter {

    @Override
    Dog createDog(dogBreed breed) {
        System.out.println("Вы зашли в отдел больших пород собак");
        Dog dog = null;
        switch (breed) {
            case SHEPHERD:
                dog = new BigShepherdDog();
                break;
            case BULLDOG:
                dog = new BigBulldogDog();
                break;
            case POODLE:
                dog = new BigPoodleDog();
                break;
            case ALABAI:
                dog = new BigAlabaiDog();
                break;
        }
        return dog;
    }
}




public class Main {

    public static void main(String[] args) {
	    DogShelter bigDogShelter = new BigDogShelter();
	    bigDogShelter.orderDog(dogBreed.ALABAI);
	    bigDogShelter.orderDog(dogBreed.BULLDOG);
	    System.out.println("----------------------------------------------------------------------");
	    DogShelter smallDogShelter = new SmallDogShelter();
	    smallDogShelter.orderDog(dogBreed.POODLE);
	    smallDogShelter.orderDog(dogBreed.SHEPHERD);
        System.out.println("----------------------------------------------------------------------");

    }
}
