import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();

        if (value % 2 == 0 && value % 3 == 0) {
            System.out.println("Found ans - " + value);
        } else {
            System.out.println("Found ans - Nothing");
        }
    }
}