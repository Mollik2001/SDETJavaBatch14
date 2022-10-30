package com.syntax.AllClass.Class17;

public class Person {
        String name;
        String color;
        String country;
        int age;
        double weight;
        String hairColor;
        String eyeColor;
        double height;
        static char gender='M';


        public Person(){

        }

        public Person(String perName){
            name=perName;
        }
        public Person(String name, String color, String country, int age, double weight, String hairColor, String eyeColor, double height, char gender) {
            this.name = name;
            this.color = color;
            this.country = country;
            this.age = age;
            this.weight = weight;
            this.hairColor = hairColor;
            this.eyeColor = eyeColor;
            this.height = height;
            this.gender = gender;
        }

        public static void main(String[] args) {
            Person person = new Person("Molli");
            Person person2 = new Person("Asma");
            System.out.println(person2.name);
            System.out.println(person.name);
        }

}

