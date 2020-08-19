package oops2.abstraction;

//public class Car {
//    public void accelerate(){
//
//    }
//    public void breaking(){
//
//    }
//}



//parent class is just a concept and children class is meaningfull the use abstract
// abstract methods of parent class should be ovverided by children class its necessary

//by the time you make a method "abstract" in a class then you have to make the whole class "abstract" too
public abstract class Car{
    public abstract void accelerate();
    public abstract void breaking(); //without using abs keyword it will give compilation error
}

//now you cannot make object of car class
// You can make object of children because they provide meaning
//simply saying car doesnt make sense here and user dont need to see it

