package ExerciseRepl;

interface FirstInterface
{
    /*
Step 3: Inherit both interfaces to Main class.

Step 4: Execute both methods
     */
void firstMethod();

}
interface SecondInterface {
   void secondMethod();

}
class test implements FirstInterface,SecondInterface{

    @Override
    public void firstMethod() {
        System.out.println("First Method implementing multiple Inheritance");
    }

    @Override
    public void secondMethod() {
        System.out.println("Second Method implementing multiple Inheritance");
    }

    public static void main(String[] args) {
        test test=new test();
        test.firstMethod();
        test.secondMethod();
    }
}
