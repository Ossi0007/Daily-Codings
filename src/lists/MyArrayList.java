package lists;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> fruits=new ArrayList();
        fruits.add("apple");
        fruits.add("cc");
        System.out.println(fruits);

        Pair<String,Integer,Boolean> p1=new Pair("Anuj",456,false);
        System.out.println(p1.x +" "+ p1.g +" "+ p1.t);
        p1.getDesc();
    }
}
