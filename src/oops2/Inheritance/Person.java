package oops2.Inheritance;

public class Person {
    protected String name;
    public void walk(){
        System.out.println("Person "+name+" is walking");
    }
    public void eat(){
        System.out.println("Person "+name+" is eating");
    }

    //above two methods are related to the object
    //but below method related to the class

    public static void laughing(){
        System.out.println("person is laughing");
    }
}
