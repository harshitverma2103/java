import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int answer = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
