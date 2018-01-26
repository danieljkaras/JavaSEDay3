package com.company;

public class StringBuilder {

    String s1 = "TO#JEST#KOLEJNY#DZIEN#W#ISA";


    /*public String Builder (){

      return ;
    }
    */




    public void myBuilder() {

        String[] sArray = s1.split("#");


        for (int i = 0; i < sArray.length; i++) {

            System.out.println(sArray[i]);
        }

        System.out.println(sArray.length);
    }


}
