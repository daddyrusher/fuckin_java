import java.util.Scanner;

public class Main {
    public static int reverse(int num) {
        int result = 0;

        while (num > 0) {
            result = result * 10 + num % 10;
            num = (int) Math.floor(num / 10);
        }
        return result;
    }

    public static int checkPalyndrom(int num) throws Exception {
        int steps = 1;
        int result = num + reverse(num);

        if (result == reverse(result)) { return steps;}

        while (result != reverse(result)) {
            steps++;
            result += reverse(result);
        }

        if (steps > 20) {
            throw new Exception("Количество шагов превысило 20!");
        }

        return steps;
    }


    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число: ");
        System.out.println("Количество шагов: " + checkPalyndrom(scanner.nextInt()));
    }
}
