import java.util.Scanner;

public class lesson4_5 {
    public static void main(String[] args) {
        System.out.print("Выводить на экран \"Не угадал!\" до тех пор, пока с клавиатуры не будет введено число 1. Запрашивать число с клавиатуры: \n" +
                "Вариант 1: перед выводом на экран \"Не угадал!\"\n" +
                "Вариант 2: после вывода на экран \"Не угадал!\"\n" +
                "Подумать, где стоило бы использовать цикл do-while, а где – нет.\n");

        Scanner in = new Scanner(System.in);

        int x;
        //-----------------------------------------------
        System.out.println("Вариант 1 (решение):");
        System.out.println("Введите число: ");
        x = in.nextInt();
        while (x != 1) {
            System.out.println("Не угадал!");
            System.out.println("Введите число: ");
            x = in.nextInt();
        }
        //-----------------------------------------------
        System.out.println("Вариант 2 (решение):");
        do{
            System.out.println("Не угадал!");
            System.out.println("Введите число: ");
            x = in.nextInt();
        }
        while (x != 1);
    }
}