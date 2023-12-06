import java.util.Scanner;

public class lesson5_2 {
    public static void main(String[] args) {
        System.out.print("Создать массив int’ов из 5 элементов. Заполнить его значениями, введенными с клавиатуры. " +
                "\nВывести на экран сумму каждого значения с предыдущим. Предыдущим значением для 0-го (нулевого) элемента считать последнее значение массива.\n");

        Scanner in = new Scanner(System.in);

        int mass[] = new int[5];
        //заполняем массив
        for (int i = 0; i < 5; i++) {
            System.out.print("Введите число № :");
            int a = in.nextInt();
            mass[i] = a;
        }
        //выводим результат
        for (int i = 0; i < 5; i++) {
            if (i == 0) {
                System.out.println(mass[i] + mass[mass.length-1]);
            }
            else {
                System.out.println(mass[i] + mass[i-1]);
            }
        }

    }
}