import java.util.Scanner;

public class lesson3_4 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = in.nextInt();
        System.out.println("Введите второе число: ");
        int b = in.nextInt();

        if ((a % 2 == 1) || (b % 3 == 0)) {
            System.out.println( a > b );
        }
        else if ((a % 2 == 0) && (a % 3 == 0)){
            double c = Math.pow(a, b);

            if ((Integer.MIN_VALUE <= c) && (c <= Integer.MAX_VALUE)) {
                System.out.println((int)Math.pow(a, b));
            }
            else {
                System.out.println("Результат выражения слишком большой!");
            }

        }
    }
}
