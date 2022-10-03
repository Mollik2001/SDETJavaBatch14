package com.syntax.AllClass.Claas15;

public class Task2Solved {

    void printEvenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println(number + "is Even");
        } else {
            System.out.println(number + "is Odd");}
     }

    public static void main(String[] args) {
     Task2Solved Task2= new Task2Solved();
     Task2.printEvenOdd(45);
     Task2.printEvenOdd(50);
    }
    }


