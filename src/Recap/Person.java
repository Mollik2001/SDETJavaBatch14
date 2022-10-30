package Recap;

public class Person {
   protected String name;
  public  String lastName;
   public int age;

}
    class Employee extends Person {
        int salary;

        public Employee(String name, String lastName, int age, int salary) {
            super();
            this.name=name;
            this.lastName=lastName;
            this.age=age;
            this.salary=salary;
        }

        void print() {
            System.out.println(name +" "+ lastName +" "+ age +" "+ salary);

        }
}

        class Student extends Employee {
            int grade;

            public Student(String name, String lastName, int age, int grade) {
                super(name, lastName, age, grade);
                this.grade=grade;
            }

            void PrintS() {
                System.out.println(name + " " + lastName + " " + age + " " + grade);

            }
        }
        class Retire extends Student {
    String seniorActivity;


            public Retire(String name, String lastName, int age, int grade,String seniorActivity) {
                super(name, lastName, age, grade);
                this.seniorActivity=seniorActivity;
            }

            void PrintRet() {
                System.out.println(name+ " "+ lastName +" "+ age+ " "+seniorActivity);

            }
        }










