package com.syntax.AllClass.Class19;

class Vehicle {
    int noOfWheel;
    int topSpeed;

}

public class Car extends Vehicle {
    String model;
    String make;
    int year;
}
class Tesla extends Car {

}
class Toyota extends Car{

}
class Tester {
    public static void main(String[] args) {
        Toyota toy=new Toyota();

    }
}