package lists.vectorAndStacks;

//using LinkedList
//we perform push(e),pop(e),peek(e)

import lists.linkedLists.myLinkedList;

public class MyStack<E> {

    private myLinkedList<E> ll=new myLinkedList<>();

    void push(E e){
        ll.add(e);
    }
    E pop() throws Exception {
        if(ll.isEmpty()){
            throw new Exception("Popping from empty stack not allowed");
        }
        return ll.removeLast();
    }
    E peek() throws Exception{
        if(ll.isEmpty()){
            throw new Exception("Peeking from empty stack not allowed");
        }
        return ll.getLast();
    }
}
