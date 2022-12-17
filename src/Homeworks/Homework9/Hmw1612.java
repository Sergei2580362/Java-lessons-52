package Homeworks.Homework9;

import java.util.Scanner;

public class Hmw1612 {

    // First level:
    // 1) пользователь вводит с консоли (Scanner) 2 числа (2 года)
    // написать программу, которая считает сколько годов между двумя числами високосные
    // Например (2000,2022) -> 6 ( для простоты считайте что год високосный если делится на 4 без остатка)

    public static void main(String[] args) {
        System.out.println("Task 1");
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первый год");
        int year1 = scan.nextInt();
        System.out.println("Введите второй год");
        int year2 = scan.nextInt();
        int count = 0;
        for (int i = year1; i < year2; i++) {
            if (i % 4 == 0) {
                count++;
            }
        }
        System.out.println("Количество високосных годов в период " + year1 + "-" + year2 + " -> " + count);

        // 2) Вывести на консоль те двузначные числа которые делятся на 4, но не делятся на 6.

        System.out.println("------");
        System.out.println("Task 2");
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0 && i % 6 != 0) { // делится на 4 и не делится на 6
                System.out.println(i);
            }
        }

        // 4) Вывести на консоль сумму чисел от 0 до 100

        System.out.println("------");
        System.out.println("Task 4");
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 4 == 0 && i % 6 != 0) { // делится на 4 и не делится на 6
                sum += i;
            }
        }
        System.out.println("Sum: " + sum);

        // 5) Вывести на консоль числа от -10 до -40.

        System.out.println("------");
        System.out.println("Task 5");
        for (int i = -10; i > -41; i--) {
            System.out.println(i);
        }

        // 6) Вывести на консоль произведение двузначных нечетных чисел кратных 13.
        System.out.println("------");
        System.out.println("Task 6");
        int result = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 13 == 0) {
                result = i * i;
                System.out.println(result);
            }
        }

        // 7) Необходимо написать программу, которая проверяет пользователя на знание таблицы умножения.
        // Пользователь сам вводит два целых однозначных числа. Программа задаёт вопрос: результат
        // умножения первого числа на второе.
        // Пользователь должен ввести ответ и увидеть на экране правильно он ответил или нет. Если нет
        //  – показать еще и правильный результат.

        System.out.println("------");
        System.out.println("Task 7");
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Введите первое число от 0 до 9");
        int num1 = scan2.nextInt();
        System.out.println("Введите второе число от 0 до 9");
        int num2 = scan2.nextInt();
        System.out.println("Введите результат умножения первого числа на второе");
        int mult = scan2.nextInt();
        if (num1 * num2 == mult) {
            System.out.println("Ответ верный");
        } else {
            System.out.println("Ответ неверный, правильный ответ " + (num1 * num2));
        }

        // 8) напишите программу, которая проверяет является ли число простым
        // Простое число - число которое делится только на 1 и на самого себя
        // Например число 17 - просто оно делится только на 1 и на 17
        // число 6 не простое - оно делится на 1, 2, 3 и 6
        // Подсказка - используйте цикл чтобы проверить сколько чисел меньше данного числа делится без остатка

        System.out.println("------");
        System.out.println("Task 8");
        Scanner scan3 = new Scanner(System.in);
        System.out.println("Введите число");
        int num3 = scan3.nextInt();
        int sum2 = 0;
        for (int i = 1; i <= num3; i++) {
            if (num3 % i == 0) {
                sum2 += i;
                System.out.println("Делится на " + i);
            }
        }
        if (sum2 > (num3 + 1)) {
            System.out.println(num3 + "-> число непростое");
        } else {
            System.out.println(num3 + "-> число простое");
        }
    }
}
