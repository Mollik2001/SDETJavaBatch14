package AllReviewClass.ReviewClass.ReviewClass3;

public class Teacher {
    String name, lName;
    String subject;
    int experience;
    static String school;

    Teacher(String name, String lName) {
        // this. use to refer to the current object: instance variable/instance method
        this.name = name;
        this.lName = lName;
    }

    // this()- refer to the current object : current class constructor.
    Teacher(String name, String lName, String subject) {
        this(name, lName);
        this.subject = subject;
    }

    Teacher(String name, String lName, int experience) {
        this(name, lName);
        this.experience = experience;
    }
    // static can work only with static
    static void work(){
        System.out.println("All teachers work at"+school);
    }
     void print(){
        System.out.println("Techer name is"+name+" "+lName);
}
 void teach(){
     System.out.println(name+" Teaches"+subject);
 }
 double getBonus(){
        if (experience<5){
            return 3;
        } else {
            return 3.5;
        }
 }
}

