package Lesson8;

public class RankSystem {

    // бальная система
    // 0 - 55 - неуд
    // 56 - 71 - удовлетворительно
    // 72 - 85 - хорошо
    // 86 - 100 - отлично

    public void calcRank(int point) {
        if (point >= 86 && point <= 100) {
            System.out.println("Отлично");
        } else if (point >= 72 && point <= 86) {
            System.out.println("Хорошо");
        } else if (point >= 56 && point <= 71) {
            System.out.println("Удовлетворительно");
        } else if (point >= 0 && point <= 55) {
            System.out.println("Неуд");
        } else {
            System.out.println("Невалидный бал");
        }
    }
}
