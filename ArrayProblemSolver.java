public class ArrayProblemSolver {
    public static void main(String[] args) {
        int[] numberArray = { 1, 8, 3, 4, 5 };
        System.out.println(checkAscendingOrder(numberArray));
    }

    public static boolean checkAscendingOrder(int[] numberArray) {
        for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] > numberArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
