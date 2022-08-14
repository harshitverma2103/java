class Calculator {
    public static void main(String[] args) {
        System.out.println("Tere bhai ka Calculator");
        System.out.println(sum(6, 5));
        System.out.println(subtract(6, 5));
        System.out.println(multiply(6, 5));
        System.out.println(divide(6, 4));
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    public static float divide(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }
}