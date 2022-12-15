package Lessons.Lesson9;

import java.util.Random;

public class MagicClass {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100);
        String str = null;
        if (num > 50) {
            str = "больше 50";
        } else {
            str = "меньше или равно 50";
        }

        // Метод 2 написания без if else
        // str = num > 50 ? "больше 50" : "меньше или равно 50";
    }

    public static String getStrValur(int num) {

        // Метод 1
        // if (num > 50) {
        //     return  "больше 50";
        // } else {
        //     return  "меньше или равно 50";
        // }

        // Метод 2 (более часто используемый)
        return num > 50 ? "больше 50" : "меньше или равно 50";
    }
}
