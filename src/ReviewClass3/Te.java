package ReviewClass3;

public class Te {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Mollik","Miah","ComputerScience");
        teacher.teach();
        Teacher teacher2=new Teacher("Jack","Smith",5);
        teacher2.print();
        Teacher.school="Syntax";
        Teacher.work();

    }
}
