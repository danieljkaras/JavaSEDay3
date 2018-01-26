package com.company;

public class Animal implements BossAnimalInterface {

    String nameAnimal;
    int ageOfAnimal;

    @Override
    public void close() {
        System.out.println("I will close application in few second. Good by.");
    }

    @Override
    public void show() {
        System.out.println("I will show you next page right now.");

    }

    public void eat() {

        System.out.println("Hi human, please put me some snacks to my bowl.");
    }
}
