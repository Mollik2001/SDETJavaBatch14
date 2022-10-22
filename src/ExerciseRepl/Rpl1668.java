package ExerciseRepl;

public class Rpl1668 {


    private static void methodM1(){
        System.out.println("private m1 method");
    }
    private static void methodM1(int a){
        System.out.println("private m1 method with int parameter");
    }
    public static void main(String[]args){
        methodM1();
        methodM1(10);
    }


}

