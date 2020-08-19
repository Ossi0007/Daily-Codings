package oops2.abstraction;

public class WagonR extends Car {
    public void accelerate(){
        System.out.println("WagonR is accelarating");
    }
    @Override
    public void breaking(){
        System.out.println("WagonR is breaking");
    }
}
