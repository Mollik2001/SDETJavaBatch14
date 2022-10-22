package ExerciseRepl;

public class Syntax {
    int batch;
    String school;
    int year;

    Syntax(int batch, String schoolName, int year) {
        this.batch = batch;
        this.school=schoolName;
        this.year = year;
    }

    void PrintInfo(){
        System.out.println("I am a student of batch "+batch+" studying at " +school+ " in the year of "+year);

    }

    public static void main(String[] args) {
        Syntax m=new Syntax(9,"Syntax",2021);
        m.PrintInfo();
    }
}





