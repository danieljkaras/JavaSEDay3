package com.company;

import java.util.Objects;

public class EqualsTest {


    String second = "trzeci";
    int someNumber = 4;
    boolean newValue = true;


    EqualsTest (String mySecond, int mySomeNumer, boolean myNewValue){

        this.second = mySecond;
        this.someNumber = mySomeNumer;
        this.newValue = myNewValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EqualsTest that = (EqualsTest) o;
        return someNumber == that.someNumber &&
                newValue == that.newValue &&
                Objects.equals(second, that.second);
    }

    @Override
    public int hashCode() {

        return Objects.hash(second, someNumber, newValue);
    }





    /*public void simpleEqual() {

        if (first == second) {

            System.out.println("This is correct ");
        }

        if (someNextNumber == someNumber) {
            System.out.println("This is correct ");

        } else {
            System.out.println("Your simpleEqual is not correct. Your numbers are diffrent.");
        }

        if (first.equals(third)) {

            System.out.println("This is equals method, it is fine.");
        } else {
            System.out.println("Your equal method doesn't work properly. ");
        }


    }

    public void hashCodeForFields() {

        System.out.println(first.hashCode());
        System.out.println(second.hashCode());

    } */


}


