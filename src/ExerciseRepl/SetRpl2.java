package ExerciseRepl;

import java.util.HashSet;

public class SetRpl2 {
        public static void main(String[]args){

            HashSet<Integer> hs=new HashSet<>();
            hs.add(111);
            hs.add(111);
            hs.add(111);
            hs.add(999);
            hs.add(999);
            hs.add(999);


            for (Integer h : hs) {
                System.out.println(h);

            }

            }





        }
