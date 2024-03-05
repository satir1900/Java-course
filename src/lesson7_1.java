/*
Написать программу, которая объединяет любое количество строк, объединяя их через пробел.
Реализацию конкатенации строк вынести в отдельный метод.
 */

public class lesson7_1 {
    static void sumStrings(String ... massStrings){

        String result = "";

        for (String row: massStrings) {
            result = result + row + " ";
        }
        System.out.println(result);
    }
    public static void main (String args[]){
        sumStrings("2","1");
        sumStrings();

    }

}