package com.syntax.AllClass.Class29;

import utils.ConfigReader;
import utils.ExcelReadaer;

import java.io.IOException;

public class FileDemo {

    public static void main(String[] args) throws IOException {
        // if you want to read config reader file easily you should go this way.
        String path="Data/config.properties";
        var properties= ConfigReader.read(path);
        System.out.println(properties.getProperty("browser"));



// If you want to read the file from excel Reader easily with just three lines of code.
        String excelpa="Data/Test.xlsx";
        var excelData=ExcelReadaer.read(excelpa);
        System.out.println(excelData);



    }
}
