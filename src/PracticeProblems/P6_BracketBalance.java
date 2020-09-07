package PracticeProblems;

import java.util.Scanner;
import java.util.Stack;

public class P6_BracketBalance {

    public static void balance(int t){
        while (t-- !=0){
            String s=sc.nextLine();
            Stack<Character> b=new Stack<>();
            boolean isBalanced=true;

            for (int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if(ch == '{' || ch== '('|| ch=='['){
                    b.push(ch);
                    continue;
                }
                if (b.empty()){
                    isBalanced=false;
                    break;
                }
                if(ch==')'){
                    if(b.peek()=='(')
                        b.pop();
                    else{
                        isBalanced=false;
                        break;
                    }
                }
                if(ch==']'){
                    if(b.peek()=='[')
                        b.pop();
                    else{
                        isBalanced=false;
                        break;
                    }
                }
                if(ch=='}'){
                    if(b.peek()=='{')
                        b.pop();
                    else{
                        isBalanced=false;
                        break;
                    }
                }
            }
            if (!b.isEmpty())
                isBalanced=false;
            if(isBalanced)
                System.out.println("Balanced");
            else
                System.out.println("Not Balanced");
        }
    }

    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int t= sc.nextInt();
        sc.nextLine();
        balance(t);
    }
}
