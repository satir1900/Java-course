import java.util.Scanner;

public class lesson4_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        int c = 0;
        while (a > 0){

            c = c + a;
            a--;
        }

        System.out.println("Result = " + c);
    }
}