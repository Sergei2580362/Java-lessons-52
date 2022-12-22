package Lessons.Lesson11;

import java.util.Scanner;

public class WhileExample {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
        }
        Scanner scanner = new Scanner(System.in);
        String s = null;
        do {
            s = scanner.nextLine();

            //
        } while (!s.equals("x"));
    }
}
