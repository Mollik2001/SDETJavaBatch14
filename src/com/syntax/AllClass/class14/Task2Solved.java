package com.syntax.AllClass.class14;

public class Task2Solved {

    public static void main(String[] args) {
        //   Create a String that should be combination of letters, numbers and special characters.
        //   Find out how many Alphanumeric(abd AZ 284) characters are there in the String.

        String str="dsfjkaAGSSJFK1234#@$%#@";
        str= str.replaceAll("[^a-zA-Z0-9]","");
        System.out.println("str = " + str);
        System.out.println(str.length());




    }
}
