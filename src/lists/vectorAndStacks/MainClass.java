package lists.vectorAndStacks;

import java.util.Stack;

public class MainClass {
    public static void main(String[] args) {

//        Vector<Integer> v=new Vector<>();
//        v.add(45);
//        v.remove(0);

        Stack<Integer> stack=new Stack<>();
        stack.push(12);
        stack.push(24);
        stack.push(36);

        int peeeek=stack.peek();
        System.out.println(peeeek+"peee  eked element");
        int popped=stack.pop();
        System.out.println(popped);
        popped=stack.pop();
        System.out.println(popped);



    }
}
