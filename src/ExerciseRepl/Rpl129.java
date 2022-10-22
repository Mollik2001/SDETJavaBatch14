package ExerciseRepl;


public class Rpl129 {

    private void pMethod() {
        System.out.println("This is Private Method");
    }
    void dfM(){
        System.out.println("This is Default Method");
    }
    protected void proMethod(){
        System.out.println("This is Protected Method");
    }
    public void publicMethod(){
        System.out.println("This is Public Method");
    }

    public static void main(String[] args) {
        Rpl129 rpl129=new Rpl129();
        rpl129.pMethod();
        rpl129.dfM();
        rpl129.proMethod();
        rpl129.publicMethod();
    }
}