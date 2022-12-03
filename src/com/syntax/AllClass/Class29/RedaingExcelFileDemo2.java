package com.syntax.AllClass.Class29;

import utils.ExcelReadaer;

import java.io.IOException;

public class RedaingExcelFileDemo2 {
    public static void main(String[] args) throws IOException {
       var excelData=ExcelReadaer.read("Data/Test.xlsx");
        System.out.println(excelData);

    }



}
