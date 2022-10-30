package com.syntax.AllClass.Class24;

import java.util.ArrayList;

public class ArrayListHw {

   /*
   Create an ArrayList that will store 5 names into it.
Find out whether the given ArrayList is empty or not?
Check whether the specific name is present in an ArrayList or not?
Find the size of your arrayList and print all values from that
    */

    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>();
        arrList.add("Mollik");
        arrList.add("Adam");
        arrList.add("John");
        arrList.add("Rosier");
        arrList.add("Rumen");
        System.out.println(arrList.isEmpty());
        System.out.println(" The name Mollik is available in ArrayList " + arrList.contains ("Mollik"));
        System.out.println(arrList.size());







    }
}
