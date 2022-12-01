package lesson3;

import java.util.Scanner;

public class TestRun {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введите число");
        int x = scan.nextInt();
        int y = x + 3 - x * 2;
        System.out.println("Результат подсчета равен " + y);

    }
}
