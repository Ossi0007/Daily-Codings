import java.util.Scanner;

public class H2 {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if((n%2!=0) || (n%2==0 && (6<=n && n<=20)))
            System.out.println("Weird");
        if((n%2==0 && (1<=n && n<=5)) || (n%2==0 && n>20))
            System.out.println("Not Weird");

        scanner.close();
    }
}
