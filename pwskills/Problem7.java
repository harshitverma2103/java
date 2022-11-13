import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int num = 1;
        int sum = 0;

        while (num <= number) {
            sum += num;
            num++;
        }
        System.out.println(sum);
    }
}
