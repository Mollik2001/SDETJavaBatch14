package Recap;

import java.util.ArrayList;

public class StArr {
    public static void main(String[] args) {
        ArrayList<String> vars = new ArrayList<>();
        vars.add("hi");
        vars.add("yo");
        vars.add("sup");
        vars.add("yolo");
        vars.add("boop");
        System.out.println(vars);

       vars.remove("hi");
       vars.remove("sup");
       vars.remove("boop");


        System.out.println(vars);

    }
}
