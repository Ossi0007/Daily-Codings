package oops2.finalKeyword;

public class MainClass extends Studentt1_ref{
    final int ROLL_NO=4;
    public static void main(String[] args) {
        final String NAME ="Anuj";
//        NAME="kumar"; you cannot assign or change anything about final variable
        String name; //blank variable
//for ref
        Studentt1_ref obj=new Studentt1_ref();
        Studentt1_ref obj2=new Studentt1_ref();
//        obj=obj2; we can do it until obj is not final
//        but still we can change the values in the object
        obj.Name="Raju"; //ex

        //
        //final method
        MainClass objj=new MainClass();
        obj.getDescription();
        //override


    }
}
