package Homeworks.Homework11;

import java.util.Random;
import java.util.Scanner;

public class Hmw2112 {
    public static void main(String[] args) {

        // First level:
        //         1) Необходимо, чтоб программа выводила на экран вот такую последовательность:
        //         7 14 21 28 35 42 49 56 63 70 77 84 91 98

        System.out.println("------");
        System.out.println("Task 1");
        int i = 7;
        int sum = 0;
        while (sum < 98) {
            sum += i;
            System.out.print(sum + " ");
        }
        System.out.println();

        //         2) Организовать беспрерывный ввод чисел с клавиатуры, пока пользователь не введёт 0.
        //         После ввода нуля, показать на экран количество чисел, которые были введены, их общую
        //         сумму и среднее арифметическое. Подсказка: необходимо объявить переменную-счетчик, которая
        //         будет считать количество введенных чисел, и переменную, которая будет накапливать общую
        //         сумму чисел.

        System.out.println("------");
        System.out.println("Task 2");
        Scanner scanner = new Scanner(System.in);
        int a;
        int sum1 = 0;
        int count = 0;
        do {
            a = scanner.nextInt();
            sum1 += a;
            count++;
        } while (a != 0);
        System.out.println(sum1);
        System.out.println(sum1 / count);


        //         3) Необходимо суммировать все нечётные целые числа в диапазоне, который введёт пользователь
        //         с клавиатуры.  Например от 10 до 100

        System.out.println("------");
        System.out.println("Task 3");
        Scanner scanner2 = new Scanner(System.in);
        int num1 = scanner2.nextInt();
        int num2 = scanner2.nextInt();
        int sum2 = 0;
        do {
            if (num1 % 2 != 0) {
                sum2 += num1;
                num1++;
            } else {
                num1++;
            }
        } while (num1 <= num2);
        System.out.println(sum2);

        //         4)Создать программу, выводящую на экран случайно сгенерированное трёхзначное натуральное
        //         число и его наибольшую цифру.

        System.out.println("------");
        System.out.println("Task 4");
        Random random = new Random();
        int num3 = random.nextInt(100, 999);
        System.out.println(num3);
        int figure;
        int max = 0;
        while (num3 > 0) {
            figure = num3 % 10;
            num3 = num3 / 10;
            if (figure > max) {
                max = figure;
            }
            System.out.println(max);
        }

        //         5) Для введённого пользователем с клавиатуры натурального числа посчитайте сумму всех его
        //         цифр (заранее не известно сколько цифр будет в числе).

        System.out.println("------");
        System.out.println("Task 5");
        Scanner scanner3 = new Scanner(System.in);
        int num4 = scanner3.nextInt();
        int sum3 = 0;
        int figure2;
        while (num4 > 0) {
            figure2 = num4 % 10;
            System.out.println(figure2);
            num4 = num4 / 10;
            sum3 += figure2;
        }
        System.out.println(sum3);
    }

}
