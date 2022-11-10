import java.util.Scanner;

public class sumoftwonum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first num");
        int num_1 = sc.nextInt();

        System.out.println("Enter second num");
        int num_2 = sc.nextInt();

        System.out.println("firstnum" + num_1);
        System.out.println("Secondnum" + num_2);

        int sum = num_1 + num_2;
        System.out.println(sum);
    }
}
