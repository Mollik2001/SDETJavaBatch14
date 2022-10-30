package Recap;

public class Test {

    public static void main(String[] args) {
        Employee employee = new Employee("Joe", "Smith", 35, 3500);
        employee.print();

        Student s = new Student("Adam", "Smith", 15, 10);
        s.PrintS();

        Retire r = new Retire("Frank", "Smith", 15, 5,"tour");
        r.PrintRet();


    }
}
