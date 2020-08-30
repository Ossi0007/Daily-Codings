package lists.linkedLists;

public class MainMyLinkedList {
    public static void main(String[] args) {
        myLinkedList<Integer> myLl=new myLinkedList<>();

        for (int i=0;i<10;i++){
            myLl.add(i*i);
        }

        myLl.print();

    }
}
