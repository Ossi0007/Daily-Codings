package PracticeProblems;

public class Answer {
    public static int MirrorSentence(String t){
        String s[] = t.split("");
        int ar[]=new int[s.length];
        for(int i=0;i<s.length-1;i++){
            ar[i]=Integer.parseInt(s[i]);
        }
        int flag=0;

        for (int i=0;i<ar.length-1;i++) {
            if ((ar[i] + ar[i+1]) == 17) {
                flag++;
                ++i;
            }
        }
        System.out.println(flag);

        return ar.length-(2*flag);
    }

    public static void main(String[] args) {
//        Scanner sc= new Scanner(System.in);
//        int l= sc.nextInt();
        String s="888999";
        int y=MirrorSentence(s);
        System.out.println(y);
    }
}
