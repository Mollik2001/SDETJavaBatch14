package com.syntax.AllClass.Class23;

public abstract class Animal {
    abstract void eat();
    abstract void sleep();
    void walk(){
        System.out.println("Cat walk");
    }

    public static void main(String[] args) {
        //Animal animal=new Animal() ;
        //  aniaml.eat();
        // Break till 11:50

    }
}
class Cat extends Animal{
    @Override
    void eat() {
int a=1;
int b=2;
        System.out.println("sum of" + a +"&" + b+"is ="+ a+b);
    }
    void sleep(){
        System.out.println("Cats like to sleep 12 to 16 hours");
    }
    void showAttitude(){
        System.out.println("hmm hmm hmm hmm");
    }

    public static void main(String[] args) {
        Cat cat= new Cat();
        cat.eat();
    }
}

class Dog extends Animal{
    @Override
    void eat() {
        System.out.println("Cats like watermelon");
    }
    void sleep(){
        System.out.println("Cats like to sleep 8 to 10 hours");
    }
}
