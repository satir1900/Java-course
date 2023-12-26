//Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
// Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
//Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.

import java.util.Scanner;
public class lesson6_3 {
    static boolean isFirstOrLast(int a1, int b1) {
        //проверяем координату она первая или последняя в наборе
        return (a1 == 1) || (a1 == b1 + 2);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int a = in.nextInt();
        System.out.print("Введите длину прямоугольника: ");
        int b = in.nextInt();

        in.close();

        for (int x = 1; x <= a + 2; x++){
            for (int y = 1; y <= b + 2; y++){

                if (isFirstOrLast(x, a) && !isFirstOrLast(y, b)) {
                    //если строка первая или последняя, а колонка не первая и не последняя
                    System.out.print("-");
                }
                else if (isFirstOrLast(y, b) && !isFirstOrLast(x, a)) {
                    //если колонка первая или последняя, а строка не первая и не последняя
                    System.out.print("|");
                }
                else {
                    //попали в угол или заполняем внутренности прямоугольника
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //Второй вариант---------------------------------

        String row1 = " ";
        String row2 = "|";
        for(int i = 1; i <= b; i++){
            row1 = row1 + "-";
            row2 = row2 + " ";
        }
        row1 = row1 + " ";
        row2 = row2 + "|";

        System.out.println(row1);
        for (int i = 0; i < a; i++) {
            System.out.println(row2);
        }
        System.out.println(row1);
    }
}