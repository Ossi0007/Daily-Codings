package oops2.Inheritance;
//for implementation of upcasting and down casting
public class MainClass2 {
    public static void main(String[] args) {
//        Teacher t =new Teacher();
//        Person p=t; //upcasting or implicit casting

        //
//        Person p=new Person();
////        Teacher t = p;  //here it throws error at compile time because person can or cant be teacher
//        Teacher t=(Teacher) p; //here we have to do it explicitly that Person is Teacher
//    //  here at compile time it will not show error but at runtime it will show error because person can be singer too

        //to correct above

        Teacher t1=new Teacher();
        Person p=t1;
        Teacher t= (Teacher) p; //here no error #downcasting


    }
}
