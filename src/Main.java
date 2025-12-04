import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isFirstNumber = false;
        boolean isSecondNumber = false;
        boolean isComplete = false;
        int firstNumber = 0;
        int secondNumber = 0;

        String regex = "\\d+";


        System.out.println("Давай сравним два целых числа, для выхода из программы введите - END:");
        while (!isComplete) {
            System.out.println("Введите целое число");
            String input = scanner.nextLine();
            if (input.equals("END")) {
                System.out.println("Буду скучать!");
                break;
            }
            if (!isFirstNumber) {
                if (input.matches(regex)) {
                    firstNumber = Integer.parseInt(input);
                    isFirstNumber = true;
                } else {
                    System.out.println("Это не целое число");
                }
                continue;
            }

            if (input.matches(regex)) {
                secondNumber = Integer.parseInt(input);
                isSecondNumber = true;
            } else {
                System.out.println("Это не целое число");
                continue;
            }
            if(isFirstNumber && isSecondNumber) {
            isComplete = true;
            }
        }
        System.out.println("Результат сравнения числе:");
        ManipulatingNumbers.compareNumbers(firstNumber, secondNumber);
        ManipulatingNumbers.sum(firstNumber, secondNumber);
        ManipulatingNumbers.subtract(firstNumber, secondNumber);
        ManipulatingNumbers.multiple(firstNumber, secondNumber);
        ManipulatingNumbers.division(firstNumber, secondNumber);

    }
}
