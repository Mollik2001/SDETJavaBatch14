package com.syntax.AllClass.class14;

public class MethodDemo2 {

    void printManyTimes(int times) {
        for (int i = 0; i < times; i++) {
            System.out.println("Hello JAVA");
        }
    }
void printCustomWordManyTimes(String word,int times){
    for (int i = 0; i < times; i++) {
        System.out.println(word);

    }
}
    public static void main(String[] args) {
      MethodDemo2 obj=new MethodDemo2();
      obj.printManyTimes(5);

      obj.printCustomWordManyTimes("Syntax Easy",3);
    }



}
