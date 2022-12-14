package com.syntax.AllClass.Class28;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileDemo1 {
    public static void main(String[] args) throws IOException {


        /*var path="Data/config.properties";
        var fileInputStream=new FileInputStream(path); // navigating the file
        var properties=new Properties();
        properties.load(fileInputStream); //loads all the data from the file inside (Memory)
        /*System.out.println(properties.getProperty(URL));

         */

        var path="Data/config.properties"; //location of the file
        var fileInputStream=new FileInputStream(path); //it helps us Navigate to the file
        var properties=new Properties(); // that special software which helps us read data from that file
        properties.load(fileInputStream); //loads all the data from the file inside(Memory)
        System.out.println(properties.getProperty("URL"));
        System.out.println(properties.getProperty("password"));
        fileInputStream.close();


    }
}
