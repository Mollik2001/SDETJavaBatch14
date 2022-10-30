package ExerciseRepl;

public class PP {
    String city;

    PP(String city) {
        this.city = city;
    }

    PP() {
        System.out.println("Parent Constructor");
    }
}
class Cc extends PP{
    Cc(String city){
        super(city);
    }
}
class Saint{

   public static void main(String[] args) {
        Cc cc=new Cc("Vienna");
       System.out.println(cc.city);


    }
}
