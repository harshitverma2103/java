public class Extract {
    private static final char[][] arr = null;

    public static void main(String[] args) {
        int n = 20345;
        int[] arr = new int[5];
        int i = 0;
        while (n > 0) {
            int k = n % 10;
            arr[4 - i] = k;
            i++;
            n = n / 10;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}
