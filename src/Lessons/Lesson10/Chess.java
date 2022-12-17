package Lessons.Lesson10;

import java.util.logging.SocketHandler;

public class Chess {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                count++;
                if (count % 2 == 0) {
                    System.out.print("x ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}

