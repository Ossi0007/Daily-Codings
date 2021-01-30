package PracticeProblems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Rss {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,8,9};
        List<Integer> l=new ArrayList<Integer>();

        for(int i=0;i<a.length-1;i++){
           l.add(a[i]+a[i+1]);
        }
        System.out.println(Collections.max(l));
    }
}
