package oops2.polymorphism;

public class MainClass2 {
    public static void main(String[] args) {
        Greetings();
        Greetings("HELLLO");
        Greetings("HEY",5);

        //we know at compile time by seeing arguments that what will happen so
        // it is compile time polymorphism :::Overloading

    }
    public static void Greetings(){
        System.out.println("hi,there");
    }
    public static void Greetings(String s){
        System.out.println(s);
    }
    public static void Greetings(String s,int count){
        for (int i=0;i<count;i++)
            System.out.println("GOOD MORNING");
    }
}
