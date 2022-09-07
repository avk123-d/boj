import java.util.Scanner;

public class boj2739 {
    public static void main(String[] args) {
        Scanner A = new Scanner(System.in);
        int N = A.nextInt();

        for (int i=1 ; i<=9; i++    ) {
            System.out.println (N+"*"+i+"="+N*i);
        }
    }
}
