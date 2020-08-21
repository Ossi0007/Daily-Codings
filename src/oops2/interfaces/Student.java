package oops2.interfaces;

public abstract interface Student {
    void study();
    default void uploadVideo(){
        System.out.println("Upload the study video");
    }

}
