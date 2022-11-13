import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int num = 1;

        while (num <= number) {
            System.out.println(num);
            num++;
        }
    }
}
