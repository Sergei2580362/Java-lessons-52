package Lesson8;

public class Test {
    public static void main(String[] args) {
        int num = 13;
        boolean divBy3 = num % 3 == 0;
        boolean divBy5 = num % 5 == 0;
        boolean divBy3AndNot5 = divBy3 && !divBy5; // делится на 3 и НЕ делится на 5
        boolean notDivBy5 = num %5 != 0; // тоже самое что !(num % 5 == 0)

        boolean isWindy = false;
        boolean isSunny = false;
        boolean canWalk = isSunny && !isWindy;

        RankSystem rankSystem = new RankSystem();
        rankSystem.calcRank(87);
        rankSystem.calcRank(74);
        rankSystem.calcRank(-98);
        rankSystem.calcRank(198);
    }
}
