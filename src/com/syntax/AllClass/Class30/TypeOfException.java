package com.syntax.AllClass.Class30;

import utils.ExcelReadaer;

import java.io.IOException;

public class TypeOfException {
    public static void main(String[] args) {


    String name=null;
        if(name!=null){
        System.out.println(name.length());
    }

    int [] arr=new int[5];
    int index=10;
        try {
        System.out.println(arr[index]);
    }catch (Exception e){
        System.out.println("Josh please fix your issues you never write good code");
    }

        if(index<arr.length){
        System.out.println(arr[index]);
    }

        try {
            System.out.println(ExcelReadaer.read("/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
