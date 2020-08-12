package oops2.Inheritance;

public class Singer extends Person { //by extends keyword Singer will become children of Person
    public void sing(){             //and it will inherit all the properties of Person
        System.out.println(name+" is singing");
    }

    public void eat(){
        System.out.println("Singer "+name+" is eating");
    }

    public static void laughing(){
        System.out.println("person is laughing");
    }
}
