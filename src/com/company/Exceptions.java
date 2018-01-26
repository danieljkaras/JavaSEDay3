package com.company;

public class Exceptions {

    int[] myArray = {1, 2, 4, 5, 3, 5, 6, 2, 53, 76, 2, 5, 6, 1, 5, 6,};


    public void TheExceptions() {

        int outOfBound = myArray.length;
        System.out.println(outOfBound);


        try {
            System.out.println(myArray[20]);
        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            System.out.println("Just go on :D ");
        }

    }


}
