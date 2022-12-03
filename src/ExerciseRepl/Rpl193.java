package ExerciseRepl;

import java.util.Iterator;
import java.util.LinkedList;

public class Rpl193 {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<>();
        num.add(111);
        num.add(222);
        num.add(333);
        num.add(444);
        num.add(555);
        num.add(666);
        int sum = 0;
        Iterator<Integer> it = num.iterator();
        while (it.hasNext()) {
            int number = it.next();
            sum += number;
        }
   System.out.println("Result of sum is "+sum);
    }
}