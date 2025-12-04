package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Давайте сравним строки:");

        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        System.out.println("Введите строку:");
        String input2 = scanner.nextLine();
        System.out.println("Результат точного сравнения строк:");
        if (input.equals(input2)) {
            System.out.println("Строки идентичны");
        } else {
            System.out.println("Строки неидентичны");
        }
        System.out.println("Результат сравнения строк по содержимому, без учета регистра и пробельных символов в начале и конце строки:");
        if(input.toLowerCase().strip().equals(input2.toLowerCase().strip())) {
            System.out.println("Строки обозначают одно и тоже");
        } else {
            System.out.println("Нет, строки все-таки разные");
        }



    }

}
