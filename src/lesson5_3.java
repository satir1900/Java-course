public class lesson5_3 {
    public static void main(String[] args) {
        System.out.print("Вычислить и записать в массив первые 10 простых чисел.\n" +
                "Простое число – положительное целое число, которое делится без остатка лишь на себя и на 1. 1 не является простым числом.\n" +
                "Вывести в консоль сумму всех элементов полученного массива.\n");

        int mass[] = new int[10];
        boolean simpal = true;
        int z = 0;
        for (int i = 2; (z < 10) ; i++) {
            for (int y = 2; y <= Math.sqrt(i); y++) {
                if (i % y == 0) {
                      simpal = false;
                    break;
                }
            }
            if ((simpal) && (i != 1)) {
                mass[z] = i;
                z = z + 1;
            } else simpal = true;

        }

        //выводим результат
        for (int aa: mass) {
            System.out.println(aa);

        }
    }
}