import java.util.Scanner;

public class lesson5_1 {
    public static void main(String[] args) {
        System.out.print("Создать массив char, заполненный буквами своего имени в верном порядке. Используя этот массив, вывести свое имя в консоль.\n" +
                "Вариант 1: не используя переменную типа String;\n" +
                "Вариант 2: предварительно собрав значения массива в переменную типа String.\n" +
                "Подсказка для варианта 2: создать пустую строку можно так: String s = “”;\n");

        char[] mass = {'И', 'в', 'а', 'н'};

        System.out.println("Вариант 1 (решение):");
        for (int i = 0; i <= (mass.length-1); i++){
            System.out.print(mass[i]);
        }
        //-----------------------------------
        System.out.println("\nВариант 2 (решение):");
        String name = "";
        for (int i = 0; i <= (mass.length-1); i++){
            name = name + mass[i];
        }
        System.out.print(name);


      }
}