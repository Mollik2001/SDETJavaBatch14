package com.syntax.AllClass.Class23;

public class Task1Tester {
    public static void main(String[] args) {
        Student[] arr={new CollegeStudent(),
                new SchoolStudent(),new SyntaxStudent()};

        for (Student st:arr
        ) {
            st.study();
            st.doHomeWork();
            st.doPractice();
        }
    }
}
