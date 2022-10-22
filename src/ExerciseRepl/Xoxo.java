package ExerciseRepl;

public class Xoxo {

     String name;
     public String city;
    protected String nameoftheschool;
    private int batchnumber;
    Xoxo(String name,String city, String nameoftheschool,int batchnumber){
      this.name=name;
        this.city=city;
        this.nameoftheschool=nameoftheschool;
        this.batchnumber=batchnumber;
    }

    void printDetails(){
        System.out.println("My name is "+name+ " and I live in "+city+ " I study at "+nameoftheschool+ " in batch " +batchnumber);
    }

    public static void main(String[] args) {
      Xoxo m=new Xoxo("John","Miami."," Syntax ",9);
      m.printDetails();

}}