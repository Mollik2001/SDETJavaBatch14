package com.syntax.AllClass.Class19;

public class Student {
    //Write a Student class   that have instance variables name and address. Create a constructor that will initialize those variables.
    // Print name & address of given  student using displayInfo method.

     String name;
    String address;

    Student(String name, String address){
this.name=name;
this.address=address;
    }
    void displayInfo() {
        System.out.println(" Name is " +name+ " Address" +address);
    }

    public static void main(String[] args) {
        new Student(" Mollik Miah ", " 124 Landon st").displayInfo();
    }


    }



