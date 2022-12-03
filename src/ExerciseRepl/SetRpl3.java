package ExerciseRepl;

import java.util.LinkedHashSet;

public class SetRpl3 {
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Red");
        linkedHashSet.add("Pink");
        linkedHashSet.add("Yellow");
        linkedHashSet.add("White");
        linkedHashSet.add("Black");
        System.out.println(" Original Hash Set:"+linkedHashSet);
        System.out.println(" Size of the Hash Set:"+linkedHashSet.size());

    }
}
