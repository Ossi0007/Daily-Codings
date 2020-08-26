package lists;

public class Pair<X,T,G> {
    X x;
    T t;
    G g;
    public Pair(X x,T t,G g){
        this.x=x;
        this.t=t;
        this.g=g;
    }

    public void getDesc(){
        System.out.println(x+" "+t);
    }
}
