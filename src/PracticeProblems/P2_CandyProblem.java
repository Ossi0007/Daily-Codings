package PracticeProblems;

/*
Alice is a kindergarten teacher. She wants to give some candies to the children in her class.  All the children sit in a line and each of them has a rating score according to his or her performance in the class.
Alice wants to give at least 1 candy to each child. If two children sit next to each other, then the one with the higher rating must get more candies. Alice wants to minimize the total number of candies she must buy.
For example, assume her students' ratings are [4, 6, 4, 5, 6, 2]. She gives the students candy in the following minimal amounts: [1, 2, 1, 2, 3, 1]. She must buy a minimum of 10 candies.
Function Description
Complete the candies function in the editor below. It must return the minimum number of candies Alice must buy.
candies has the following parameter(s):
n: an integer, the number of children in the class
arr: an array of integers representing the ratings of each student
Input Format
The first line contains an integer, , the size of .
Each of the next  lines contains an integer  indicating the rating of the student at position .
Constraints
Output Format
Output a single line containing the minimum number of candies Alice must buy.
Sample Input 0
3
1
2
2
Sample Output 0
4
Explanation 0
Here 1, 2, 2 is the rating. Note that when two children have equal rating, they are allowed to have different number of candies. Hence optimal distribution will be 1, 2, 1.
 */

import java.util.Arrays;
import java.util.Scanner;

public class P2_CandyProblem {

    public static long candy(int n,int[] a){
        int[] c=new int[n];
        Arrays.fill(c,1);

        for (int i=1;i<n;i++){
            if (a[i]>a[i-1])
                c[i]=c[i-1]+1;
        }
        for (int i=n-1;i>0;i--){
            if (a[i-1]>a[i])
                c[i-1]=Math.max(c[i]+1,c[i]);
        }

        long sum=0;
        for (int i=0;i<n;i++)
            sum+=c[i];
        return sum;
    }
        private static final Scanner sc =new Scanner(System.in);

    public static void main(String[] args) {

        int n=sc.nextInt();
        int[] a=new int[n];
        for (int i=0;i<n;i++)
            a[i]=sc.nextInt();

        long result=candy(n,a);
        System.out.println(result);

    }

}
