import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Principle");
        float p = sc.nextFloat();

        System.out.println("Enter interest");
        float r = sc.nextFloat();

        System.out.println("Enter time");
        float t = sc.nextFloat();

        System.out.println("Principle=" + p);
        System.out.println("interest=" + r);
        System.out.println("Time=" + t);

        float si = p * r * t / 100;
        System.out.println("The simple interest will be =" + si);

    }
}
