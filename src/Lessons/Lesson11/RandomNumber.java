package Lessons.Lesson11;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        int predict;
        int howManyTries = 0;
        int maxTries = 4;
        System.out.println("Я загадал число, угадай его");
        do {
            howManyTries++;
            predict = scanner.nextInt();
            if (predict > number) {
                System.out.println("загаданное число меньше");
            } else if (predict < number) {
                System.out.println("загаданное число больше");
            }
        } while (predict != number && howManyTries < maxTries);
        if (predict == number) {
            System.out.printf("Молодец угадал %s, ты потратил %s попыток", number, howManyTries);
        } else {
            System.out.printf("Ты проиграл, загаданное число %s", number);
        }
    }
}
