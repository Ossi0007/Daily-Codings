package PracticeProblems;

import java.util.Scanner;

// finding sum of series like 3+33+333+....up to n times
//4+44+444+4444+.....n times

public class P3_Sum3_plus_33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no in single digit for summation like 3+33+333.....");
        int num = sc.nextInt();
        System.out.println("Enter no of times to repeat it");
        int n=sc.nextInt();
        long  b=num;
        long sum=0;
        int mul=10;
        for (int i=1;i<=n;i++){
            sum+=b;
            b=num+b*mul;
        }
        System.out.println(sum);
    }
}