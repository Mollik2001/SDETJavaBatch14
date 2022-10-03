package com.syntax.AllClass.class14;

import java.util.Arrays;

public class StringRecap {
    public static void main(String[] args) {
        String str="KjfksfAAJDSK23456807!@#$%";
        str= str.replaceAll("[^a-zA-Z]","");
        System.out.println("str = " + str);

        String sentence ="Batch 14 is great. Batch 14 is excellent?";
        String[] split = sentence.split("[,.?!]");
        System.out.println("split ="+ Arrays.toString(split));






    }
}
