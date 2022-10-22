package ExerciseRepl;

public class Calculator {

        static int sub (int a, int b) {
            return a-b;
        }
        static int sub(int a, int b, int c){
            return b-c;
        }
        static int sub(int a, int b, int c, int d){
            return c - d;

    }


    public static void main(String[] args) {

        System.out.println(sub(50,10 )+" (should come from subtracting 4 numbers");
        System.out.println(sub(40,10 )+" (should come from subtracting 3 numbers");
        System.out.println(sub(30,10 )+" (should come from subtracting 4 numbers");

    }}