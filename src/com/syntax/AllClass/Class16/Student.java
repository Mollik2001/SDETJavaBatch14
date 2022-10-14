package com.syntax.AllClass.Class16;

public class Student {



        String name;
        String id;
      static int numberOfStudent;

    public static void main(String[] args) {


     Student student=new Student();
     student.name="mollik";
     student.id="2";
     Student.numberOfStudent++;

   Student asghar=new Student();
   student.id="2";
    student.name="miaasghar";
     Student.numberOfStudent++;


        System.out.println(student.numberOfStudent);
        System.out.println(student.numberOfStudent);


    }

}
