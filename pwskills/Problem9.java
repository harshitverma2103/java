public class Problem9 {
    public static void main(String[] args) {
        int number = 1;

        while (true) {
            if (number % 5 == 0 && number % 7 == 0) {
                System.out.println(number);
                break;
            }
            number++;
        }
    }
}
