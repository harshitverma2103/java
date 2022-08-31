public class FibonacciSeries {
    public static void main(String[] args) {
        getFibonacciSeries(13);
        printSeries(getFibonacciSeries(13));
    }

    public static int[] getFibonacciSeries(int length) {
        int[] fibonacciSeries = new int[length];
        int leftNum = 0;
        int rightNum = 1;
        int result = 0;
        if (length == 0) {
            return fibonacciSeries;
        }

        fibonacciSeries[0] = leftNum;

        for (int i = 1; i < length; i++) {
            fibonacciSeries[i] = rightNum;
            result = leftNum + rightNum;
            leftNum = rightNum;
            rightNum = result;
        }
        return fibonacciSeries;
    }

    public static void printSeries(int[] arr) {
        for(int i =0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

