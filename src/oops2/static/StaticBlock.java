package oops2;
//static block will always be executes first
public class StaticBlock {
    static{
        System.out.println("in block 1");
    }

    static{
        System.out.println("in block 2");
    }

    public static void main(String[] args) {
        System.out.println("in block main");
    }

    static{
        System.out.println("in block 3");
    }

}
