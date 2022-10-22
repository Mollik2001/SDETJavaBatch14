package ExerciseRepl;

public class Replit {
//   Overload instance method display by having different types of parameters

    // Inside each method write the logic to print value of the parameter

    //  Call all methods inside your main method

    int num;
    double num2;
    String print;

    Replit(int num){
        num=num;

        System.out.println(num);
    }
    Replit(String print){
        print=print;
        System.out.println(print);
    }
    Replit(double num2){
        num2=num2;
        System.out.println(num2);
    }


    public static void main(String[] args) {
       Replit replit=new Replit(100);
       Replit replit1=new Replit("Syntax Technologies");
       Replit replit2=new Replit(100.09);




        }



    }



