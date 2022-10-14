package Recap;

public class Practise1 {

}
class Teacher {
    String name;
    int age;
    int yearsOfExperience;
    Teacher(String name, int age, int yearsOfExperience){
      this.name=name;
      this.age=age;
      this.yearsOfExperience=yearsOfExperience;
    }
      void teach()
      { System.out.println(name+ " is teaching");

    }
}
class MathTeacher extends Teacher{
    void teachTheClass() {
        System.out.println("I will teach the class even the world is going to end right after my class");
    }
    MathTeacher(String name, int age, int yearsOfExperience){
       super(name, age, yearsOfExperience);
    }
}
class ChemistryTeacher extends Teacher {
    ChemistryTeacher(String name, int age, int yearsOfExperience){
        super(name, age, yearsOfExperience);
    }
    void teachChem(){
        System.out.println(name+ "teaching chemistry");
    }
}
class PianoTeacher extends Teacher {
    PianoTeacher(String name, int age, int yearsOfExperience) {
        super(name, age, yearsOfExperience);
    }
}