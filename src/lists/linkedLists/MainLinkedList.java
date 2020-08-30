package lists.linkedLists;

import java.util.*;

public class MainLinkedList {
    public static void main(String[] args) {
        List<Integer> ll=new LinkedList<>(); //we can change it to ArrayList and there will be no error in operations
        //after changing elements will be treated as the object of arraylist
        List<Integer> al=new ArrayList<>();
        getTimeDiff(ll);
        getTimeDiff(al);

    }
    static void getTimeDiff(List<Integer> list){
        long start=System.currentTimeMillis();
        for (int i=0;i<100000;i++){
            list.add(0,i);
        }
        long end=System.currentTimeMillis();
        System.out.println(list.getClass().getName()+
                "-->"+(end-start));
    }
}
