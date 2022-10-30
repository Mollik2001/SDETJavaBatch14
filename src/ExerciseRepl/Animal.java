package ExerciseRepl;

   /* Create a class Animal in which define instance variable type,
   constructor that will initialize instance variables and 2 methods eat and sleep.
        Create a subclass Cat in which override method sleep
        Create 3 Kitten subclasses of a Cat class and override method eat
for 1 kitten - eats milk
        for 2 kitten - eats snack
        for 3 kitten - eats everything
    */
 public class Animal {

    public Animal(){
      }
public void eat(){
    System.out.println();
}
       public void sleep() {
       }
   }
   class Cat extends Animal {

       public void eat() {
           System.out.println("Cats eat");
       }

      public void sleep() {
           System.out.println("Cat sleeps a lot");
       }
   }
   class Kitten1 extends Cat{
     public void eat(){
         System.out.println("kitten1 eats milk");
     }

     public void sleep(){
         System.out.println("kitten1 sleeps a lot");
     }
       }

   class Kitten2 extends Cat{
     public void eat(){
System.out.println("kitten2 eats snacks");
   }
   public void sleep(){
       System.out.println("kitten2 sleeps a lot");
     }
   }

class Kitten3 extends Cat{
    public void eat() {
        System.out.println("kitten3 eats everything");
    }
    public void sleep(){
        System.out.println("kitten3 sleeps a lot");

        }


    public static void main(String[] args) {
        Animal[]animals={new Cat(),new Kitten1(),new Kitten2(),new Kitten3()};
        for (Animal availableM: animals
             ) {
            availableM.eat();
            availableM.sleep();
        }}
    }
