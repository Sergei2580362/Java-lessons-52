package Homeworks.Homework6;

import java.util.Scanner;

public class Homework08122022 {
    // 1) Введите с консоли два числа и выведите больше ли второе число чем   первое
    // 2) Создайте метод, который принимает 2 числа и возвращает больше или равно первое число по сравнению со вторым
    // 3) создайте метод который будет принимать 2 строки и писать возвращать строку, которая составляется склеиванем
    // первой половины первого слова и второй половины второго слова
    // Например
    // Вход : "привет" и "цветок". на выходе будет "приток". (при - первая половина от первого слова, ток - вторая половина от второго слова)

    // #1
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        System.out.println("Второе число больше чем первое?");
        System.out.println(b >= a);

        // #2
        boolean res = isMoreOrEqual(5, 6);
        System.out.println(res);
        // #3
        System.out.println(smartConcat("привет", "цветок"));
    }
        
        public static boolean isMoreOrEqual(int first, int second) {
            return first >= second;
        }

        // #3
        //String word1 = "привет";
        //String word2 = "цветок";
        //System.out.println(word1.substring(0,3)+word2.substring(3,6)); //));

        public static String smartConcat(String str1, String str2) {
             String f = str1.substring(0,str1.length()/2);
             String s = str2.substring(str2.length()/2);
             return f + s;
    }


}
