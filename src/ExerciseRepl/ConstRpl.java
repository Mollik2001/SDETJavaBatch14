package ExerciseRepl;

public class ConstRpl {
    String schoolName;
    int batch;
    int year;
    String lastDayOfClass;
   ConstRpl(){
}
    ConstRpl(String schoolName,int batch, int year,String lastDayOfClass) {
       this.schoolName=schoolName;
      this.batch=batch;
       this.year=year;
       this.lastDayOfClass=lastDayOfClass;
    }
    void display() {
            System.out.println(schoolName+" "+ batch +" " +year + " "+lastDayOfClass);
    }

    }

class SyntaxTech{
    public static void main(String[] args) {
           ConstRpl def=new ConstRpl();
           ConstRpl call=new ConstRpl("Syntax",6,2020,"07/30/2022");
           def.display();
         call.display();





    }
}
