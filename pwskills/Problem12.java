import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int answer = 0;

        while (number > 0) {
            answer = answer * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(answer);
    }
}
