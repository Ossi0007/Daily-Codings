package conditionalStatement;

public class NestedIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=12, b=18, c=100;
		int result=0;
		
		if(a>b) {
			if(a>c) {
				result=a;
			}else {
				result=c;
			}
		}else {
			if(b>c) {
				result=b;
			}else {
				result=c;
			}
		}
		System.out.println("largest of the three numbers is"+result);
	}

}
