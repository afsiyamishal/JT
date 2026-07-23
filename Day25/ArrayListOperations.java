package Day25;

import java.util.*;

public class ArrayListOperations{

    public static void main(String[] args){

        ArrayList<String> list=new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C");

        list.remove("Python");

        System.out.println(list);

    }
}