package com.syntax.AllClass.Claas15;

public class Task3Solved {

    //Create a method that will print whether given String is palindrome or not.


    void printPalindrome(String str){
        str=str.toLowerCase();
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)){
            System.out.println("The String is Palindrome");
        }else {
            System.out.println("The String not Palindrome");
        }
    }
    // Break till 11:50
    public static void main(String[] args) {
        Task3Solved task=new Task3Solved();
        task.printPalindrome("Dad");
        task.printPalindrome("Thor");
    }


}
