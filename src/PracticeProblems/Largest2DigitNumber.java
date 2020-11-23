package PracticeProblems;


import java.util.Scanner;

public class Largest2DigitNumber {
    public static int solution(String s){
        int t=0;
        int t1;
        for(int i=0;i<s.length()-1;i++){
            int j=Integer.parseInt(String.valueOf(s.charAt(i)));
            int k=Integer.parseInt(String.valueOf(s.charAt(i+1)));
            t1=j*10+k;
            if(t1>t)
                t=t1;
        }
        return t;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s= sc.nextLine();
        int tt=solution(s);
        System.out.println(tt);

    }
}
