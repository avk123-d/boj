import java.util.Scanner;

public class boj1330 {
    public static void main(String[] args) {
        Scanner one= new Scanner(System.in);
        int a = one.nextInt();
        int b = one.nextInt();

        if (a > b) {

            System.out.print(">");
        }
        if (a < b) {

            System.out.print("<");
        }
        if (a == b) {

            System.out.print("==");
        }
    }
}
