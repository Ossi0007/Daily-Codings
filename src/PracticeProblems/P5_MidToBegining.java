package PracticeProblems;

/*
Here question is to take a sentence as an input with a double digit number
and then performing operation on the word of sentence which is at same place in the sentence as
the first digit of the number...and second digit will find the word
(which is at the same place as the 2nd digit)to perform operation.

-----------------------

ex:41,"Today is a Nice day"


operation to perform:
Nice --> iNce (if even)
Grapes-->arGpes
Today-->doTday (if odd)
Mango-->naMngo

only first half letters will be reversed ie: from mid to beg and last half will remain same
and we have to return String with Reversed first half+Unreversed seconf half

-----------------------

 */

import java.util.Scanner;

public class P5_MidToBegining {

    public static String wordProcess(String s,int n){

        String[] word=new String[1000];
        int index=0;
        for(String val:s.split(" ")){
            word[index]=val;
            index+=1;
        }
        String fir=word[n/10 -1];
        String sec=word[n%10 -1];
        class local {
            public String fun(String s1) {
                String temp = "";
                int mid = s1.length() / 2;
                if (s1.length()%2==1){
                    mid+=1;
                    for(int i=mid-1;i>=0;i--)
                        temp+=s1.charAt(i);
                    for(int i=mid-1;i<s1.length();i++)
                        temp+=s1.charAt(i);
                }
                else{
                    for(int i=mid-1;i>=0;i--)
                        temp+=s1.charAt(i);
                    for(int i=mid;i<s1.length();i++)
                        temp+=s1.charAt(i);
                }
                return temp ;
            }
        }
        String t1=new local().fun(fir);
        String t2=new local().fun(sec);

        System.out.println(t1+" "+t2);
        return null;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        wordProcess(s,num);
    }
}
