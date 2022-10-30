package com.syntax.AllClass.Class22;

public interface Shape {
    public void calculateArea();
    void calculatePerimiter();


}
class Circle implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("abc");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("b");
    }
}
class Square implements Shape{

    @Override
    public void calculateArea() {
        System.out.println("abc");
    }

    @Override
    public void calculatePerimiter() {
        System.out.println("b");
    }
}
