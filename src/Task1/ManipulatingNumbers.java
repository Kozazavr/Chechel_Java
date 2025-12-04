package Task1;

public class ManipulatingNumbers {

    public static void compareNumbers(int firstNumber, int secondNumber) {
        int compare = Integer.compare(firstNumber, secondNumber);
        if (compare == 0) {
            System.out.println(firstNumber + " = " + secondNumber);
        } else if (compare < 0) {
            System.out.println(firstNumber + " < " + secondNumber);
        } else if (compare > 0) {
            System.out.println(firstNumber + " > " + secondNumber);
        }
    }

    public static void sum(int firstNumber, int secondNumber) {
        System.out.println("Сумма двух чисел: " + (firstNumber + secondNumber));
    }

    public static void subtract(int firstNumber, int secondNumber) {
        System.out.println("Разность двух чисел: " + (firstNumber - secondNumber));
    }

    public static void multiple(int firstNumber, int secondNumber) {
        System.out.println("Результат умножения двух чисел: " + (firstNumber * secondNumber));
    }

    public static void division(int firstNumber, int secondNumber) {
        System.out.println("Результат деления двух чисел: " + (firstNumber / secondNumber));
    }

}
// совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
