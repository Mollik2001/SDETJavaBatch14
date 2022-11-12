package Recap;

import java.util.ArrayList;

public class ArrList<S> {
    public static void main(String[] args) {
        ArrayList<String> name=new ArrayList<>(1);
        System.out.println(name.isEmpty());
        name.add("Syntax");
        System.out.println(name.contains(name.isEmpty()));
    }
}
