package ExerciseRepl;

public class ParTes {
    public static void main(String[] args) {
       Par[]pars={new Child1(),new Child1.Child2(),new Child1.Child3()};
        for (Par par:pars
             ) {
            par.hello();
        }
    }
}
