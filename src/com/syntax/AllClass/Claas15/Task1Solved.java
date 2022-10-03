package com.syntax.AllClass.Claas15;

import java.util.Scanner;

public class Task1Solved {

    //Create a method that will take 2 parameters as a numbers and prints which number is larger.

    void printLarger(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("Number 1 is larger" + num1);
        } else if (num2 > num1) {
            System.out.println("Number 2 is larger" + num2);
        } else {
            System.out.println("Number are equal");
        }
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner (System.in);
        System.out.println("please enter the first number");
        int num1= scanner.nextInt();
        System.out.println("Please enter the second number");
        int num2= scanner.nextInt();


        Task1Solved Task1=new Task1Solved();
        Task1.printLarger(12,36);
        Task1.printLarger(50,12);


    }
}