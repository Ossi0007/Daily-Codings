package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List<String> fruits=new LinkedList<>();
        List<String> vegetables=new ArrayList<>();
        //1
        fruits.add("apple");
        fruits.add("orange");

        System.out.println(fruits);

        //2
        vegetables.add("potato");
        vegetables.add("tomato");
        vegetables.add("carrot");

        fruits.addAll(vegetables);
        System.out.println(fruits);

        System.out.println(fruits.get(2));
        fruits.set(2,"Banana");
        System.out.println(fruits.get(2)); //here banana is set at 2
        fruits.remove(2);
        System.out.println(fruits.get(2));
        System.out.println(fruits.size());
        System.out.println(fruits.contains("Guava"));
        System.out.println(fruits.isEmpty());

        //toArray();
        //returns array of String
//        String[] temp = new String[fruits.size()];
//        fruits.toArray(temp);
//        for (String e:temp)
//            System.out.println(e);

        //returns Array of Object

        Object[] a=fruits.toArray();
        for (Object e:a)
           System.out.println(e);


//        Pair<String,Integer,Boolean> p1=new Pair("Anuj",456,false);
//        System.out.println(p1.x +" "+ p1.g +" "+ p1.t);
//        p1.getDesc();
//
}
}
