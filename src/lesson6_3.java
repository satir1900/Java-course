//Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа).
// Нарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “.
// Каждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.
//Произвести декомпозицию по своему усмотрению. Рекомендую скинуть на проверку. Контакт ниже.

import java.util.Scanner;
public class lesson6_3 {
    static boolean first_last(int a1, int b1) {
        return ((a1 == 1) || (a1 == b1 + 2));
    }

    static boolean usl(int a1, int b1) {
        return (a1 == b1 + 2);
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int a = in.nextInt();
        System.out.print("Введите длину прямоугольника: ");
        int b = in.nextInt();
        //int y;

        for (int x = 1; x <= a + 2; x++){
            for (int y = 1; y <= b + 2; y++){

                if (first_last (x, a) && ((y == 1) || usl(y, b))){
                    System.out.print(" ");
                }
                else if (first_last (x, a) && ((y != 1) || usl(y, b))) {
                    System.out.print("-");
                }
                else if (first_last (y, b) && ((x != 1) && !usl(x, a))) {
                    System.out.print("|");
                }
                else {
                    System.out.print(" ");
                }
                if (y == b + 2) {
                    System.out.println();
                }
            }
        }
    }
}