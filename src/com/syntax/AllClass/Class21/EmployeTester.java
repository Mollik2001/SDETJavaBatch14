package com.syntax.AllClass.Class21;

public class EmployeTester {
    public static void main(String[] args) {

        OfficeBoy officeBoy=new OfficeBoy();
        officeBoy.calculateSalary();

        Tester tester=new Tester();
        tester.calculateSalary();

        Developer developer=new Developer();
        developer.calculateSalary();
    }
}

