package Lessons.Lesson11;

public class DebugTest {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0 || i % 3 == 0) {
                System.out.println("labadada");
            }
        }
    }
}
