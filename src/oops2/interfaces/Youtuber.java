package oops2.interfaces;

public abstract interface Youtuber extends VideoEditor{
     void makeVideo();
//     void uploadVideo(){
//          System.out.println("upload the video");
//     } --->>>throws error" abs method cannot have a body"
     default void uploadVideo(){
          System.out.println("Upload the video");
     }
}
