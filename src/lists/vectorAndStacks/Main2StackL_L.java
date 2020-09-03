package lists.vectorAndStacks;

public class Main2StackL_L {
    public static void main(String[] args) throws Exception {
        MyStack<Integer> stack=new MyStack<>();
        stack.push(12);
        stack.push(24);
        stack.push(36);

        int peeeek=stack.peek();
        System.out.println(peeeek+"peeked element");
        int popped=stack.pop();
        System.out.println(popped);
        popped=stack.pop();
        System.out.println(popped);
    }
}
