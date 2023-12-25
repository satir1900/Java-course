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

                if (isFirstOrLast(x, a) && isFirstOrLast(y, b)){
                    //если попали в угол
                    System.out.print(" ");
                }
                else if (isFirstOrLast(x, a) && !isFirstOrLast(y, b)) {
                    //если строка первая или последняя, а колонка не первая и не последняя
                    System.out.print("-");
                }
                else if (isFirstOrLast(y, b) && !isFirstOrLast(x, a)) {
                    //если колонка первая или последняя, а строка не первая и не последняя
                    System.out.print("|");
                }
                else {
                    //заполняем внутренности прямоугольника
                    System.out.print(" ");
                }
                if (y == b + 2) {
                    System.out.println();
                }
            }
        }

    }
}