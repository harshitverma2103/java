import java.util.Scanner;

import java.util.Arrays;

public class Problem19 {
    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] ans = { arr[0], arr[arr.length - 1] };
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " element:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest element " + ans[0]);
        System.out.println("largest element " + ans[1]);
    }
}
