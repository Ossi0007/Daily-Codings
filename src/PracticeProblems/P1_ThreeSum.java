package PracticeProblems;

import java.util.Arrays;
import java.util.Scanner;

public class P1_ThreeSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        sc.nextLine();
        int[] n=new int[x];
        for(int i=0;i<x;i++)
            n[i]=sc.nextInt();
        Arrays.sort(n);
        for (int i=0;i<x-2;i++){
            int j=i+1;
            int k=x-1;
            while (j < k) {
                if ((n[j] + n[k]) +n[i]> 0)
                    k--;
                else if ((n[j] + n[k]) +n[i]< 0)
                    j++;
                else if ((n[j] + n[k]) +n[i]== 0){
                    System.out.print("Triplet is " + n[i] + ", " + n[j] + ", " + n[k]);
                    break;
                }
            }
        }
    }
}
