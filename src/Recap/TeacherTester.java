package Recap;

public class TeacherTester {
    public static void main(String[] args) {
        MathTeacher mathTeacher=new MathTeacher("Jubiha",35,10);
        mathTeacher.teach();
        ChemistryTeacher chemistryTeacher=new ChemistryTeacher("Mollik",25,1);
        chemistryTeacher.teach();

    }
}
