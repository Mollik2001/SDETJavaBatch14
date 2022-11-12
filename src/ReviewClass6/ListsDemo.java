package ReviewClass6;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListsDemo {
    public static void main(String[] args) {
        ArrayList<String> animals=new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Lion");
        animals.add("Monkey");
        animals.add("Tiger");
        animals.add("Elephant");
        animals.add("Wolf");
        System.out.println(animals);
        // how to print size of each word from list?
        for (String animal : animals) {
            System.out.println(animal.length());
        }

        // how can we remove words which have more than 5 letter.

       // animals.removeIf(x->x.length()>4);
        // System.out.println(animals);

        // if element is more then 4 letter we want to replace that with camel
        // we should not use iterator because we are not performing any operation that can change the size of list.
        // we should not use enhanced for loop here as we're not printing the data , we are updating the data as we need the index too update the data we should use simple for loop.
        for (int i = 0; i <animals.size() ; i++) {
            if (animals.get(i).length()>4){
                animals.set(i,"Camel"); // set method replace the element
                System.out.println(animals);

            }

        }
        System.out.println(animals.subList(0,3));
        // print each one single value
        ListIterator<String>stringListIterator=animals.listIterator();
        while(stringListIterator.hasNext()){
            System.out.println(stringListIterator.next());
        }

    }}

