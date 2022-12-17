package Lessons.Lesson10;

public class ForInFor {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
//            System.out.println("1 for начался");
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "" + j);
            }
            System.out.println("");
        }

        // рисуем треугольник
        int width = 10;
        int high = 10;
        for (int i = 0; i < high; i++) {
            for (int j = 0; j < width; j++) {
                if (j < (high - i)) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
