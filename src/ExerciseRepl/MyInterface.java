package ExerciseRepl;

public interface MyInterface {
    void method1();
    void method2();
}
class NewInerface implements MyInterface{

    @Override
    public void method1() {
        System.out.println("implementation of method1");
    }

    @Override
    public void method2() {
        System.out.println("implementation of method2");
    }

    public static void main(String[] args) {
        NewInerface n=new NewInerface();
        n.method1();
        n.method2();
    }
}
