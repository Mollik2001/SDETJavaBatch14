package com.syntax.AllClass.Class28;

import java.util.HashMap;
import java.util.Set;

public class MapPrintValueandKeys {

    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("I Phone 14", 1000.00);
        items.put("Eggs", 20.4);
        items.put("Apples", 5.8);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);

        Set<String> keys = items.keySet();

        for (String key : keys) {
            System.out.println(key);
        }

        for (Double aDouble : items.values()) {
            System.out.println(aDouble);

        }

    }


}