package com.syntax.AllClass.Class28;

import java.util.HashMap;
import java.util.Iterator;

public class MapsDemo {
    public static void main(String[] args) {
        HashMap<String,Double> items=new HashMap<>();
        items.put("I Phone 14",1000.00);
        items.put("Eggs",20.4);
        items.put("Apples",5.8);
        items.put("Keyboard",100.0);
        items.put("Flower",1.0);
// I want to remove the items if their price is more than 10.

        Iterator<Double>iterator=items.values().iterator();


    }
}
}