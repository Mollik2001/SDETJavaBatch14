package ExerciseRepl;

import java.util.Scanner;
class MethodLoop{
    public static void main(String [] args){
        Scanner s = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int i= s.nextInt();
        print(i);
    }
   static void print(int x){
        for(int y=1;y<x;y++){
            System.out.println(y);
        }
    }}

