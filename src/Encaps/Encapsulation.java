package Encaps;

public class Encapsulation {
    public static void main(String[] args) {
        Student obj =new Student();
//        obj.age =56;
//        obj.name = "Tom"; it will not be accesible when private student variables
        obj.setAge(13);
        System.out.println(obj.getAge());
        obj.setName("Rajuu");
        System.out.println(obj.getName());
    }
}
