package ExerciseRepl;

class Rpl165 {

    public void Parent(){
        System.out.println("I am parent public");
    }

    public void Child1(){
        System.out.println("I am a Child public method");
    }
    protected void Child2(){
        System.out.println("I am a Child protected method");

    }
    void Child(){
        System.out.println("I am a child default method");


    }
}
class Childs extends Rpl165{
    public void Child1(){
        System.out.println("I am a Child public method");
    }

    protected void Child2(){
        System.out.println("I am a Child protected method");

    }

    void Child() {
        System.out.println("I am a child default method");

    }
    }
