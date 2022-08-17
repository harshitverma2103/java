public class Extract1 {
    public static void main(String[] args) {
        int count = 0;
        int n = 20345;
        String str = "";
        while (n > 0) {
            int k = n % 10;
            str = str + k;
            count = count + 1;
            n = n / 10;
        }
        char[] arr = new char[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(4-i);
            System.out.println(arr[i]);
        }
    }
}
