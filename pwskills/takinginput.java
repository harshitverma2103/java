import java.util.Scanner;

public class takinginput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Name -" + name);

        System.out.println("enter your lucky number");
        int num = sc.nextInt();
        System.out.println("Lucky number is -" + num);

    }
}
