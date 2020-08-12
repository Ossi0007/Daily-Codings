package oops2;
import oops2.A.*;

public class StaticKeyword {
    public static void main(String[] args) {
        A objA =new A();
        B objB= objA.new B();                                    //here to make object of class B we have to
        //here we access it by using objA                        //make object of A first..because B is closely related to A

        C objC=new A.C(); //here we access it by class name
    }
}
