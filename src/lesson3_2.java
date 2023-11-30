import java.util.Scanner;

public class lesson3_2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку:");
        String a = in.nextLine();

        if (a.equals("Hi")) {
            System.out.println("Hello");
        }
        else if (a.equals("Bye")) {
            System.out.println("Good bye");
        }
        else if (a.equals("How are you")) {
            System.out.println("How are you");
        }
        else {
            System.out.println("Unknown message");}

        //------------------------------

        switch (a) {
            case "Hi":
                System.out.println("Hello");
                break;
            case "Bye":
                System.out.println("Good bye");
                break;
            case "How are you":
                System.out.println("How are you");
                break;

            default:
                System.out.println("Unknown message");

        }
    }
}