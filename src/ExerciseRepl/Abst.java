package ExerciseRepl;

abstract class Abc {
    public abstract void m2();

    public abstract void m1();

    }

    class Cew extends Abc {
        public void m2() {
            System.out.println("Child class providing implementation");
        }

        public void m1() {
            System.out.println("Parent class providing implementation");
        }

        public static void main(String[] args) {
            Cew cew = new Cew();
            cew.m2();
            cew.m1();
        }
    }






