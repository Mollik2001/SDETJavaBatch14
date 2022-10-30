package ExerciseRepl;

abstract class Parr {
    // Create a Parent Class that will have two overloaded abstract methods m1
    //Make Main class as concrete subclass to Parent Class
    //    In main method call the methods.
    public abstract void m1();

    public abstract void m1(int a);
    }
public class Neo extends Parr{
    public void m1(){
        System.out.println("m1 without parameter");
    }
    public void m1(int a){
        System.out.println("m1 method with parameter");

    }

    public static void main(String[] args) {
        Neo neo=new Neo();
        neo.m1();
        neo.m1(10);
    }



    }







