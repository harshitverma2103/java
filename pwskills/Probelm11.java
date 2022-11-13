import java.util.Scanner;

public class Probelm11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int numberOfDigits = 0;

        while (number > 0) {
            number = number / 10;
            numberOfDigits++;
        }
        System.out.println("Number of digits = " + numberOfDigits);
    }
}