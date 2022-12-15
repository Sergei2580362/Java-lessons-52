package Lessons.Lesson6;

import java.util.Random;

public class RandomTest {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите первое число ");
//        int first = scanner.nextInt();
//        System.out.println("Введите второе число ");
//        int second = scanner.nextInt();
        Random random = new Random();
        int first = random.nextInt(-50, 50);
        int second = random.nextInt(-50, 50);
        int sum = first + second;
        System.out.println(first + " прибавить " + second + " равно " + sum);
    }
}
