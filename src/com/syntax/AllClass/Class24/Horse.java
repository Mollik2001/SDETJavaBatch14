package com.syntax.AllClass.Class24;

public class Horse {
    private String name;
    private String breed;
    private String color;
    private int age;


    public Horse(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);

    }

    public void setName(String name) {
        this.name = name;

    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("Breed can't be empty");
        } else {
            this.breed = breed;
        }
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("Color can't be empty");
        }
        this.color = color;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age can't be negative");
        } else {
            this.age = age;

            this.age = age;
        }
    }

        public String getName () {
            return name;
        }

        public String getBreed () {
            return breed;
        }

        public String getColor () {
            return color;
        }

        public int getAge () {

            return age;
        }
    }



