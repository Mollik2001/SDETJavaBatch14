package ExerciseRepl;

public class Par {
    void hello() {
        System.out.println("method in Parent class");
    }
}
    class Child1 extends Par {
        void hello() {
            System.out.println("method in Child1 class");
        }
   static class Child2 extends Child1{
            void hello(){
                System.out.println("method in Child2 class");
            }
        }
        static class Child3 extends Child2{
            void hello(){
                System.out.println("method in Child3 class");
            }
        }
    }




