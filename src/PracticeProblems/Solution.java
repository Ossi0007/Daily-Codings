package PracticeProblems;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(System.in)){
            int cases=sc.nextInt();
            for (int t=1;t<=cases;t++){
                int n=sc.nextInt();

                String ar[]= sc.nextLine().split(" ");
                int[] A=new int[n];
                for(int i =0 ;i < n;i++){
                    A[i] = Integer.parseInt(ar[i]);
                }
                int[] c=new int[n];
                int count=0;
                for(int i=0;i<n-1;i++){
                    int diff=A[i+1]-A[i];
                    if(n>2 && diff==A[i+2]-A[i+1]) {
                        count++;
                        c[i] = count;
                    }
                }
                for (int i=1;i<=t;i++){
                    System.out.println("Case #"+t+": "+(c[i]));
                }
            }
        }
    }
}
