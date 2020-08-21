package oops2.interfaces;

public class Person implements Student,Youtuber{

    public static void main(String[] args) {
        Person obj=new Person();
//        obj.makeVideo();
        obj.study();
        obj.uploadVideo();

        Youtuber obj2=obj; //here we just gave reference by typecasting
        //this is noy instantiation we are not using new keyword here...we are just passing reference
        obj2.makeVideo();
        obj2.editVideos(); //we can do it in interfaces
//        obj2.study(); here it cannot function study
        //because when upcasting is done then obj2 will be treated as Youtuber only


    }
    @Override
    public void study(){
        System.out.println("person is studying");
    }

    @Override
    public void uploadVideo(){
        System.out.println("no body");
    }

    @Override
    public void makeVideo(){
        System.out.println("person is making video");
    }

    @Override
    public void editVideos() {
        System.out.println("Youtuber is editing");
    }
}
