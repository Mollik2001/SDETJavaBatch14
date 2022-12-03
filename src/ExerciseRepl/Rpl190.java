package ExerciseRepl;

import java.util.LinkedList;

public class Rpl190 {
    public static void main(String[] args) {
        LinkedList<Integer> fab = new LinkedList<>();
        Integer firstTenFebNum = 10, firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= firstTenFebNum; ++i) {
          System.out.print(firstTerm + ", ");
            Integer nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }
}