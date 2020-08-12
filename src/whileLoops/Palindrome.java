package whileLoops;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int reversedNumber=0;
		
		int temp=n;
		while(temp>0) {
			int lastDigit=temp%10;
			reversedNumber=reversedNumber*10+lastDigit;
			temp=temp/10;
		}
		if(reversedNumber==n) {
			System.out.println(n +" is Palindrome number");
		}else {
			System.out.println(n+" is not a Palindrome");
		}

	}

}
