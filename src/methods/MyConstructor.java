package methods;

class Vehicle{
    int wheels;
    int headlights;
    String color;
//    Vehicle(){ //here in vehicle(-----) we didnt pass any arg.so it is called no-arg const.
//        wheels=4;
//    }

//    Vehicle(int noOfWheels){ //Parameterized const
//        wheels=noOfWheels;
//    }

    Vehicle(int wheels){ //Parameterized const
        this.wheels=wheels; //this keyword points to current object
        headlights=2;
    }
    Vehicle(int wheels,String color){
        this.wheels=wheels;
        this.color=color;
        headlights=2;
    }

}
public class MyConstructor {
    MyConstructor(){
        System.out.println("object is created");
    }

    public static void main(String[] args) {
        Vehicle car = new Vehicle(4);
        Vehicle scooty = new Vehicle(2);
        Vehicle eRiksaw=new Vehicle(3,"Yellow");
//you cannot call a default constructor if you have made any
        System.out.println(car.wheels+" wheels");
        System.out.println(scooty.wheels+" wheels");
        System.out.println(eRiksaw.wheels+" wheels and color: "+eRiksaw.color);
    }

}
