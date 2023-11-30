import java.util.Scanner;

public class lesson3_3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Введите фамилию: ");
        String LName = in.nextLine();
        System.out.println("Введите имя: ");
        String Name = in.nextLine();
        System.out.println("Введите отчество:" );
        String SName = in.nextLine();

        System.out.println(LName + " " + Name + " " + SName);
        System.out.printf("%s %s %s", LName, Name, SName);

        }
    }
