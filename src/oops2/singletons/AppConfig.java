package oops2.singletons;

public class AppConfig {
    private AppConfig(){

    }
//    private static AppConfig obj =new AppConfig();  //we will optimize it below
    private static AppConfig obj = null; //optimized
    public static AppConfig getInstance(){
        if(obj==null) obj = new AppConfig();
        return obj;
    }
}
