package Examples;

import java.util.ArrayList;
import java.util.LinkedList;

public class Exaples {

    public static void main(String[] args) {
        int some[] = new int[4];

        ArrayList<Integer> some_dyn = new ArrayList<>(5);
        some_dyn.add(5);
        some_dyn.add(6);
        some_dyn.add(7);
        some_dyn.add(8);
        some_dyn.add(9);
        some_dyn.add(10);

        some_dyn.remove(1);

        //some_dyn.size();

        for(Integer x : some_dyn){

            System.out.println(x);

        }
        LinkedList<String> names = new LinkedList<>();
        names.add("Tom");
        names.add("Jem");
        names.add("Carry");
        names.add("Puppy");

        names.add(1, "Alex");

        //some_dyn.size();

        for(String x : names){

            System.out.println(x);

        }

    }
}