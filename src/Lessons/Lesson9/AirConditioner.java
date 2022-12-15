package Lessons.Lesson9;

import java.util.Scanner;

public class AirConditioner {
    public static void main(String[] args) {
        // У Маши в комнате висит простой кондиционер. Он включается, если в комнате температура больше 20 градусов;
        // если же температура 20 градусов или ниже, кондиционер выключается. Маша хочет охладить комнату, но она
        // умная и понимает, что если температура воздуха на улице ниже, чем в комнате, то надо не включать
        // кондиционер, а открыть окно. Напишите программу, которая определит, что будет делать Маша.
        // Входные данные:
        // На первой строке вводится одно число — температура в комнате.
        // На второй строке одно число — температура на улице.
        Scanner scanner = new Scanner(System.in);
        int tempInRoom = scanner.nextInt();
        int tempOutside = scanner.nextInt();
        // tempInRoom > 20 -> надо охладить комнату
        // tempInRoom < 20 -> ничего не делать
        if (tempInRoom > 20) {
            if (tempOutside < tempInRoom) {
                System.out.println("открой окно");
            } else {
                System.out.println("включи кондей");
            }
            // включить кондёр
            // открыть окно
        } else {
            System.out.println("ничего не делать");
        }
    }

    public static String whatToDo(int tempInRoom, int tempOutside) {
        if (tempInRoom > 20) {
            return tempOutside < tempInRoom? "открой окно" : "включи кондей"; // вариант тернарный оператор

// Либо же вариант else if

//            if (tempOutside < tempInRoom) {
//                return "открой окно";
//            } else {
//                return "включи кондей";
//            }
        } else {
            return "ничего не делать";
        }
    }
}
