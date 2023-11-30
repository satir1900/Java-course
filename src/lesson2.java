import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Задача №2.1 (c = b*a*(a + b)/(a2))");
        System.out.print("Input A: ");
        Float a = in.nextFloat();
        System.out.print("Input B: ");
        Float b = in.nextFloat();

        Float c = b * a * (a + b) / (a * a);
        System.out.printf("Result : %f \n", c);

        //---------------------------------------------
        System.out.print("Input A: ");
        int a1 = in.nextInt();
        System.out.print("Input B: ");
        int b1 = in.nextInt();

        int c1 = b1 * a1 * (a1 + b1) / (a1 * a1);
        System.out.printf("Result : %d \n", c1);

        //-------------------------------------
        System.out.println("Задача №2.2 (a3 > b2)");
        System.out.print("Input A: ");
        int a2 = in.nextInt();
        System.out.print("Input B: ");
        int b2 = in.nextInt();

        boolean c2 = (a2 * a2 * a2) > (b2 * b2);
        System.out.printf("Result : %s \n", c2);

        in.close();

        //-----------------------------------------------------
        System.out.println("Задача №2.3");

        int a3 = 1;
        int b3 = a3++;
        b3 += a3++;

        System.out.println(b3);
        System.out.println(a3);

    }
}