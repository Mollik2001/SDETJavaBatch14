package com.syntax.AllClass.Claas15;

public class Task4Solved {

    // Create a method that will say Hello in
    // different language based on the country
   // that will passed when method is executed.

    void SayHello(String country) {

        switch (country) {
            case "USA":
                System.out.println("Hello");
                break;
            case "India":
                System.out.println("Namaste");
                break;
            case "Turkiye":
                System.out.println("Merhaba");
                break;
            case "Japan":
                System.out.println("Nihau");
                break;

            default:
                System.out.println("Country is not available");
        }

    }

    public static void main(String[] args) {

       Task4Solved Task4=new Task4Solved();
       Task4.SayHello("Japan");


    }
    }
