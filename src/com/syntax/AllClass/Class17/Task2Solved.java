package com.syntax.AllClass.Class17;

public class Task2Solved {
    // Create a method that will take a String as a parameter and returns reversed String
// Method should be available to all classes within your project and accessible by class name.


   public static     String reverseStr(String str) {
         String newStr;
           StringBuilder sb = new StringBuilder(str);
           sb.reverse();
           newStr = sb.toString();
           return newStr;
       }
    public static void main(String[] args) {
        System.out.println(Task2Solved.reverseStr("Sunday"));
    }}
//  return new StringBuilder(str).reverse().toString();
//    }
//
//    public static void main(String[] args) {
//        System.out.println(Student.reverseStr("Sunday"));