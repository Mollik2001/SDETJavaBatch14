package com.syntax.AllClass.Class28;

import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("I Phone 14", 1000.00);
        items.put("Eggs", 20.4);
        items.put("Apples", 5.8);
        items.put("Keyboard", 100.0);
        items.put("Flower", 1.0);


        //Set<Map.Entry<String,Double>>entrySet=items.entrySet();
        // easy way to do it
        var entrySet=items.entrySet();

      //  var dog=new Dog();
       // var num=new 10.2;

        // remembeer var does not work with instance variable.
        System.out.println(entrySet);

        for (var item:entrySet
        ) {
            System.out.println(item);
        }



    }

}
