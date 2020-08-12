package oops.packages.models;

public class Student {

    public String name; //then it will not be visibl in MainClass if we try to access name object

    public Student(String name){
        this.name=name;
    }
    public  String getName(){
        return  name;
    }
     String getPassword(){
        return "fsjafkad";
    }
}
