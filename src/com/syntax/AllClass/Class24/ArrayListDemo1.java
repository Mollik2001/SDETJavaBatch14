package com.syntax.AllClass.Class24;

import java.util.ArrayList;

public class ArrayListDemo1 {

    public static void main(String[] args) {

        ArrayList<String >colors=new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Black");
        colors.add("Yellow");
        colors.add("Purple");
        System.out.println(colors);
        System.out.println(colors.get(0));
        System.out.println(colors.get(02));
        System.out.println(colors.size());

        for (int i = 0; i <colors.size() ; i++) {
            System.out.println(colors.get(i));
        }
        System.out.println("*************");
        for(String color: colors){
            System.out.println(color);

        }





    }





}
