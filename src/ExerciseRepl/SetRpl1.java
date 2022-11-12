package ExerciseRepl;

import java.util.HashSet;

public class SetRpl1 {
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("third");
        hashSet.add("first");
        hashSet.add("second");
        System.out.println(hashSet);
        hashSet.removeAll(hashSet);
        System.out.println(hashSet);


    }
}
