public class Arrayproblem {
    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 6, 7 };
        int answer = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > answer) {
                answer = arr[i];
            }
        }
        System.out.println(answer);
    }
}
