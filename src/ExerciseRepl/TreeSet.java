package ExerciseRepl;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
      Set<String> ts=new java.util.TreeSet<>();
      ts.add("India");
      ts.add("Australia");
      ts.add("South Africa");
      ts.add("India");
      ts.add("America");
      ts.add("America");
        System.out.println(ts);

    }
}
