package oops2.polymorphism;

public class MainClass {
    public static void main(String[] args) {

        Dog d=new Dog();

        Pet p=d;

        d.walk();
        p.walk();
        System.out.println(d.name);
        System.out.println(p.name);  //in overriding variable name override nahi hoti hai
        //here compiler cant say which walk function gonna be used
        System.out.println(d instanceof Dog);
// instance of p can be checked only at runtime so it is runtime poly

    }
}
