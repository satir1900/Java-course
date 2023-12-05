import java.util.Scanner;

public class lesson4_3 {
    public static void main(String[] args) {
        System.out.print("Написать программу, которая принимает длину и ширину прямоугольника (2 целых числа). \nНарисовать в консоли заданный прямоугольник, используя “-“ и “|”. Углы прямоугольника обозначить символом “ “. \nКаждая единица длины должна обозначаться одним символом “-“, каждая единица ширины – символом “|“.\n");

        Scanner in = new Scanner(System.in);
        System.out.print("Введите ширину прямоугольника: ");
        int a = in.nextInt();
        System.out.print("Введите длину прямоугольника: ");
        int b = in.nextInt();
        //int y;

        for (int x = 1; x <= a + 2; x++){
            for (int y = 1; y <= b + 2; y++){

                if (((x == 1) || (x == a + 2))
                && ((y == 1) || (y == b + 2))){
                    System.out.print(" ");
                }
                else if (((x == 1) || (x == a + 2))
                        && ((y != 1) || (y != b + 2))) {
                    System.out.print("-");
                }
                else if (((x != 1) && (x != a + 2))
                        && ((y == 1) || (y == b + 2))) {
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