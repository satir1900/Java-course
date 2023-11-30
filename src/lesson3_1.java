import java.util.Scanner;

public class lesson3_1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = in.nextInt();

        System.out.println("Введите второе число:");
        int b = in.nextInt();
        int c;
        if (a % 2 == 1) {
            c = a * b;
        }
        else {
            c = a / b;
        }
        System.out.println("A * B  = " + c);
    }
}