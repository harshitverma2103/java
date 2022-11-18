import java.util.Scanner;

class Problem15 {
    public int add(int firstNum, int secondNum) {
        int answer = firstNum + secondNum;
        return answer;
    }

    public class main {
        public static void main(String[] args) {
            Problem15 obj = new Problem15();
            Scanner sc = new Scanner(System.in);
            int firstNum = sc.nextInt();
            int secondNum = sc.nextInt();
            System.out.println("sum of input number is");
            int answer = obj.add(firstNum, secondNum);
            System.out.println(answer);
        }
    }
}