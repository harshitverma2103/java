public class Problem10 {
    public static void main(String[] args) {
        for (int num = 1; num <= 7; num++) {
            if (num % 3 == 0) {
                continue;
            }
            System.out.println(num);
        }
    }
}
