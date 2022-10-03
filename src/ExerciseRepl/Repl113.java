package ExerciseRepl;

public class Repl113 {
    //Step1: Create a method that will accept with 2 parameters of integer type
    //
    //Step2: Write the logic in that method in println statement to print hours and minutes

    void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    public static void main(String[] args) {
        Repl113 Time=new Repl113();
        int hour = 11;
        int minute = 30;
        Time.printTime(hour, minute);
}}
