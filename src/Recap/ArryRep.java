package Recap;
import java.util.ArrayList;
public class ArryRep {
    public static void main(String[] args) {
        /*
        Create an Arraylist of type Integer.
Add below elements to it.
111
222
333
444
555
666
Print the ArrayList.
remove all the elements.
Print the Arraylist.

         */
        ArrayList<Integer> numbers = new ArrayList<>(6);
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(555);
        numbers.add(444);
        numbers.add(555);

        System.out.println(numbers);
        numbers.removeAll(numbers);
        System.out.println(numbers);


        }
    }




