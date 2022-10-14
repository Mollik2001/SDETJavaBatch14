package com.syntax.AllClass.Class16;

public class Task1Tester {

    public static void main(String[] args) {
        SyntaxEmploye syntaxEmploye =new SyntaxEmploye();
        syntaxEmploye.empID="123";
        syntaxEmploye.salary=100000;

        System.out.println(syntaxEmploye.CEO);

        SyntaxEmploye mozzem=new SyntaxEmploye();
        mozzem.empID="123";
        mozzem.salary=1000;
        System.out.println(syntaxEmploye.CEO);

    }
}
