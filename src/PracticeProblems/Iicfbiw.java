package PracticeProblems;

import java.util.Scanner;

public class Iicfbiw {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while (t>0){
            int n= sc.nextInt();
            sc.nextLine();
            String ar[]= sc.nextLine().split(" ");
            int[] a=new int[n];
            for(int i =0 ;i < n;i++){
                a[i] = Integer.parseInt(ar[i]);
            }
            for(int i=0;i<(n/2);i++){
                int temp=a[i];
                a[i]=a[n-i-1];
                a[n-i-1]=temp;

            }

            for(int i=0;i<n;i++)
                System.out.print(a[i]+" ");
            t--;
        }
    }
}
