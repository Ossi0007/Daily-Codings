package PracticeProblems;

import java.util.Scanner;

public class P3_Sum3_plus_33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no in single digit for summation like 3+33+333.....");
        int a = sc.nextInt();
        System.out.println("Enter no of times to repeat it");
        int n=sc.nextInt();
        long  b=a;
        long sum=0;
        int mul=10;
        for (int i=1;i<=n;i++){
            sum+=b;
            b=a+b*mul;
        }
        System.out.println(sum);
    }
}