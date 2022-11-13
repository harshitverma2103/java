import java.util.Scanner;

public class Problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int fectorial = 1;

        for (int i = 1; i <= number; i++) {
            fectorial = fectorial * i;
            System.out.println("Fectorial of " + i + " = " + fectorial);
        }
    }
}
