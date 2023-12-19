/**
 * Декомпозировать задачу https://github.com/KFalcon2022/practical-tasks/blob/master/src/com/walking/lesson3_casts_conditional_constructions/Task2SwitchCase.java
 * * Вынести в отдельный метод использование switch-case.
 * Также вынести в отдельный метод использование  System.out.println
 */

import java.util.Scanner;

/**
 * Написать программу, которая принимает строку с клавиатуры.
 * Если строка == "Hi" - вывести в консоль "Hello",
 * если Bye - Good bye,
 * если How are you - How are your doing.
 * Если любая другая строка - вывести Unknown message.
 * Сделать через switch-case
 */

public class lesson6_1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = scanner.nextLine();
        scanner.close();
        SwitchCase(s);
    }
    static void SwitchCase (String line) {
        switch (line) {
            case "Hi":  // Если s равно "Hi"
                MyPrint("Hello");
                break;
            case "Bye":
                MyPrint("Good bye");
                break;
            case "How are you":
                MyPrint("How are your doing");
                break;
            default:  // Если значение s не совпадает ни с одним кейсом
                MyPrint("Unknown message");
        }

    }
    static void MyPrint (String message){
        System.out.println(message);
    }
}
