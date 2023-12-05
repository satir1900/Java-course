import java.util.Scanner;

public class lesson4_4 {
    public static void main(String[] args) {
        System.out.print("Выводить на экран \"Не угадал!\" до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры: \n" +
                "\n" +
                "Вариант 1: перед выводом на экран \"Не угадал!\"\n" +
                "\n" +
                "Вариант 2: после вывода на экран \"Не угадал!\"\n" +
                "\n" +
                "Подумать, где стоило бы использовать цикл do-while, а где – нет.");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int x = in.nextInt();

        for (int i = 1; i < 10; i++) {
            if (x == i) {
                System.out.println("числа равны!");
            }
            else if (x % 2 == 1) {
                System.out.println(i + " + " + x + " = " + (i + x));
            }
            else {
                System.out.println(i + " - " + x + " = " + (i - x));

            }
        }
    }
}