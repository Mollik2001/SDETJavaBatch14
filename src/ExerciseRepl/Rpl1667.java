package ExerciseRepl;

public class Rpl1667 {
    static void method() {
        System.out.println("static method without parameter");
    }

    static void method (int a){
        System.out.println("static method with int parameter");
    }

    public static void main(String[] args) {
        Rpl1667.method();
        Rpl1667.method(10);
    }
}