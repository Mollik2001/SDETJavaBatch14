package com.syntax.class14;

public class MethodDemo1 {
  void printHello(){

      System.out.println("Hello World");
      System.out.println("I love Java");
  }
void printWord(String word){
    System.out.println(word);
}
    public static void main(String[] args) {
        MethodDemo1 obj=new MethodDemo1();
        obj.printHello();

        obj.printWord("Dont worry you will get it");
        obj.printWord("It will takes sometime but you fine");
    }



}
