public class ArrayProblemSolver {
    public static void main(String[] args) {
        int[] numberArray = { 1, 8, 3, 4, 5 };
        System.out.println(checkAscendingOrder(numberArray));
        char[] arr = changeNumberToArrray(20345);
        printCharArray(arr);
    }

    public static boolean checkAscendingOrder(int[] numberArray) {
        for (int i = 0; i < numberArray.length - 1; i++) {
            if (numberArray[i] > numberArray[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static char[] changeNumberToArrray(int inputNumber) {
        int digitCount = 0;
        String numberString = "";
        {
            while (inputNumber > 0) {
                int lastDigit = inputNumber % 10;
                numberString = numberString + lastDigit;
                digitCount = digitCount + 1;
                inputNumber = inputNumber / 10;
            }
            char[] characterArray = new char[digitCount];
            for (int index = 0; index < characterArray.length; index++) {
                characterArray[index] = numberString.charAt(4 - index);
            }
            return characterArray;
        }
    }

    public static void printCharArray(char[] arr) {
        for (int index = 0; index < arr.length; index++) {
            System.out.println(arr[index]);
        }
    }
}
