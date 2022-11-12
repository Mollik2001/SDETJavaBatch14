package ExerciseRepl;

import java.util.HashSet;
import java.util.Iterator;

public class SetRpl2 {
        public static void main(String[]args){

            HashSet<Integer> hs=new HashSet<>();
            hs.add(111);
            hs.add(111);
            hs.add(111);
            hs.add(999);
            hs.add(999);
            hs.add(999);


            Iterator<Integer> itr=hs.iterator();
            while (itr.hasNext()){
                System.out.println(itr.next());
            }






        }

    }
