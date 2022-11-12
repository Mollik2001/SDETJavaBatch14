package com.syntax.AllClass.Class27;

import java.util.LinkedHashMap;

public class Mapdemo2 {
    public static void main(String[] args) {

        LinkedHashMap<String,Double> beautyProduct=new LinkedHashMap<>();

        beautyProduct.put("Fundation",50.5);
        beautyProduct.put("Blush",20.0);
        beautyProduct.put("Lipstick",10.5);

        LinkedHashMap<String,Double> cosmetics=new LinkedHashMap<>();

        cosmetics.put("Soap",10.2);
        cosmetics.put("Conditioner",20.5);
        cosmetics.put("Shampoo",30.99);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProduct);
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        grocery.remove(beautyProduct); // does not  work we can't remove all entire from the map


        System.out.println(grocery);



    }
}
