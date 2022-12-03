package com.syntax.AllClass.Class30;

public class FinallyBlockDemo {
    public static void main(String[] args) {
        try {
            System.out.println(10/0);
        }catch (ArithmeticException ae){
            System.out.println("Operator is not Allowed");
            }finally {
            System.out.println("This block is always executed no matter what");
            System.out.println("1");
        }
    }
}
