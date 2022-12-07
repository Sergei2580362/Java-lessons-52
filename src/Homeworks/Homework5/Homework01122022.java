package Homeworks.Homework5;

import java.util.Random;
import java.util.Scanner;

public class Homework01122022 {
    public static void main(String[] args) {
        // 1.) Написать программу, которая считывает с консоли (Scanner) строку и выводит на консоль ее длину

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println(name.length());

        // №2
        // Написать метод который будет возвращать результат склейки двух строк.
        // Например: вызывается метод со строками  "I love " и "Java" после этого метод вернет I love Java

        String str1 = "I love";
        String str2 = "Java";
        String res = magicFunc(str1, str2);
        System.out.println(res);

        // №4 - напишите класс с методами для конвертации градусы цельсия в фаренгейты и метод для конвертации фаренгейтов в цельсия

        DegreeConverter degreeConverter = new DegreeConverter();
        System.out.println(degreeConverter.fromCelcius(10));
        System.out.println(degreeConverter.toCelcius(50));

        // №5 - напишите метод для получения суммы трех чисел

        Random random = new Random();
        int first = random.nextInt(-100, 100);
        int second = random.nextInt(-100, 100);
        int third = random.nextInt(-100, 100);
        int sum = first + second + third;
        System.out.println(first + " прибавить " + second + " прибавить " + third + " равно " + sum);

    }

    public static String magicFunc(String str1, String str2) {
        return str1 + " " + str2;
    }

    // №3 - создайте 5 методов с разной сигнатурой, но с одинаковым названием метода

    public static int test() {
        return 1;
    }

    public static int test(int i) {
        return 1;
    }

    public static int test(double d, String s) {
        return 1;
    }

    public void test(double d) {
    }

    public void test(String s, double d) {
    }
}
