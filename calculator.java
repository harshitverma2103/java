class Calculator {
    public static void main(String[] args) {
        System.out.println("Tere bhai ka Calculator");
        System.out.println(sum(6, 5));
        System.out.println(subtract(6,5));
    }

    public static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;
    }
}