package ExerciseRepl;

 interface ParentInterface {
    void ParentMethod();

}
interface ChildInterface{
  void childMethod();
}
class TestPandC implements ParentInterface,ChildInterface{


    @Override
    public void ParentMethod() {
        System.out.println("Parent Method-welcome to Syntax");
    }

    @Override
    public void childMethod() {
        System.out.println("Child Method-hello Syntax");
    }

    public static void main(String[] args) {
        TestPandC t=new TestPandC();
        t.ParentMethod();
        t.childMethod();
    }
}
