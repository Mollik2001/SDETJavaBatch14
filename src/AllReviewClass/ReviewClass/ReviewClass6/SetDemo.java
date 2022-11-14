package AllReviewClass.ReviewClass.ReviewClass6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {

        //if we don't override equaks methods in our customs classes most of the collection framework will not work properly with those classes.
        Set<Student> students=new HashSet<>(); //upcasting
        students.add(new Student("Mollik","Mollik","123"));
        students.add(new Student("Zara","Mollik","125"));
        students.add(new Student("Jas","Mollik","126"));
        students.add(new Student("Adriyaan","Mollik","129"));
        System.out.println(students);


        // how we can print only one single line output

        List<Student> setStudents=new ArrayList<>(students);
        System.out.println(setStudents.get(1));




    }
}
