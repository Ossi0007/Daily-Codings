package oops.packages;

import oops.packages.models.Student;
import oops.packages.models.Teacher;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Student obj = new Student("tom");
//        obj.name="jerry" here it willshow error because name is private
        obj.name="jerry";
//        obj.getPassword(); here it is not accesible because this class is in different package
//        and this password class is default that can only be accessed within that native package
        Teacher teacher=new Teacher();
        Scanner sc = new Scanner(System.in);
    }
}
