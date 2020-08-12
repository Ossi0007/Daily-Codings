package Encaps;

public class Student {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 20) {
            System.out.println("you cant be student");
        } else {
            this.age = age;
            System.out.println("you can be a student");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
