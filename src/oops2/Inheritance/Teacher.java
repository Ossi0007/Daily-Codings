package oops2.Inheritance;

public class Teacher extends Person {
    public void teach(){
        System.out.println(name+" is Teaching");
    }
    public void eat(){ //this eat method will override the eat method of parent class
        super.eat(); // super keyword is used to access parent class from child class
        System.out.println("Teacher "+name+" is eating");
    }
    public static void laughing(){
        System.out.println("person is laughing");
    }
}
