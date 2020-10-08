package PracticeProblems;public class Robot {
    public static void main(String[] args) {
        String t=moveRobot(5,4,"1-2-E","r M l m L M r");
        System.out.println(t);
    }
    public static String moveRobot(int input1,int input2,String input3,String input4){
    String path[]=input3.split("-");
    int x=Integer.parseInt(path[0]);
    int y=Integer.parseInt(path[1]);
    String pos=path[2];
    String output="";
    String ans="";
    String mov[]=input4.split(" ");
      for(int i=0;i< mov.length;i++){
        if(mov[i].equals("r"))
        {
            if(pos.equals("N"))
                pos="NE";
            else if(pos.equals("NE"))
                pos="E";
            else if(pos.equals("E"))
                pos="SE";
            else if(pos.equals("SE"))
                pos="S";
            else if(pos.equals("S"))
                pos="SW";
            else if(pos.equals("SW"))
                pos="W";
            else if(pos.equals("W"))
                pos="NW";
            else if(pos.equals("NW"))
                pos="N";
            else if(pos.equals("SW"))
                pos="W";

        }
        else if(mov[i].equals("R"))
        {
            if(pos.equals("N"))
                pos="E";
            else if(pos.equals("NE"))
                pos="SE";
            else if(pos.equals("E"))
                pos="SE";
            else if(pos.equals("SE"))
                pos="SW";
            else if(pos.equals("S"))
                pos="W";
            else if(pos.equals("SW"))
                pos="NW";
            else if(pos.equals("W"))
                pos="N";
            else if(pos.equals("NW"))
                pos="NE";
            else if(pos.equals("SW"))
                pos="NW";

        }
        else if(mov[i].equals("l"))
        {
            if(pos.equals("N"))
                pos="NW";
            else if(pos.equals("NE"))
                pos="N";
            else if(pos.equals("E"))
                pos="NE";
            else if(pos.equals("SE"))
                pos="E";
            else if(pos.equals("S"))
                pos="SE";
            else if(pos.equals("SW"))
                pos="S";
            else if(pos.equals("W"))
                pos="SW";
            else if(pos.equals("NW"))
                pos="W";


        }
        else if(mov[i].equals("L"))
        {
            if(pos.equals("N"))
                pos="W";
            else if(pos.equals("NE"))
                pos="NW";
            else if(pos.equals("E"))
                pos="N";
            else if(pos.equals("SE"))
                pos="NE";
            else if(pos.equals("S"))
                pos="E";
            else if(pos.equals("SW"))
                pos="SE";
            else if(pos.equals("W"))
                pos="S";
            else if(pos.equals("NW"))
                pos="SW";


        }
        else if(mov[i].equals("M"))
        {
            if(pos.equals("N")){
                if(y+1>input2){
                    output+="ER";
                    break;
                }
                y+=2;
            }
            else if(pos.equals("NE"))
            {

                if(x+1>input1){
                    output+="ER";
                    break;
                }
                if(y+1>input2){
                    output+="ER";
                    break;
                }
                x+=2;
                y+=2;
            }
            else if(pos.equals("E")){

                if(x+1>input1){
                    output+="ER";
                    break;
                }
                x+=2;
            }
            else if(pos.equals("SE"))
            {

                if(x+1>input1){
                    output+="ER";
                    break;
                }
                if(y-1<0){
                    output+="ER";
                    break;
                }
                x+=2;
                y-=2;
            }
            else if(pos.equals("N")){
                if(y-1<0){
                    output+="ER";
                    break;
                }
                y-=2;
            }
            else if(pos.equals("SW"))
            {

                if(x-1<0){
                    output+="ER";
                    break;
                }
                if(y-1<0){
                    output+="ER";
                    break;
                }
                x-=2;
                y-=2;
            }
            else if(pos.equals("W"))
            {

                if(x-1<0){
                    output+="ER";
                    break;
                }
                x-=2;
            }
            else if(pos.equals("NW"))
            {

                if(x-1<0){
                    output+="ER";
                    break;
                }
                if(y+1>input2){
                    output+="ER";
                    break;
                }
                x-=2;
                y+=2;
            }
        }
    }
        if(output.length()>1)
            ans=String.valueOf(x)+"-"+String.valueOf(y)+"-"+pos+"-"+output;
        else
            ans=String.valueOf(x)+"-"+String.valueOf(y)+"-"+pos;
        return ans;

}
}
