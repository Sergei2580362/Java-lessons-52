package Lessons.Lesson11;

public class AtmTest {
    static int howManyIterations = 0;
    public static void main(String[] args) {

        // У вас на банковском счету N долларов.
        // ВЫ хотите снять все, но банк разрешает снять только сумму,
        // которая является делителем текущей суммы на счету и меньше текущей суммы.
        // Если вы снимаете максимально возможную сумму каждый день,
        // сколько дней вам понадобится,
        // чтобы забрать все свои деньги из банка?
        // Примечание: если оставшаяся сумма равна 1, вы можете снять ее.
        // int n -> func -> int
        //
        //number -> 1 2 3 4 5
        int number = 10_000; //10237 итераций было до оптимизации программы, после стало 248
        int howManyCountSpent = 0;
        while (number > 0) {
            if (number == 1) {
                number = 0;
            } else {
                int maxDivider = calcMaxDivider(number);
                number -= maxDivider;
            }
            howManyCountSpent++;
        }
        System.out.println(howManyCountSpent);
        System.out.printf("Итераций %s", howManyIterations);
    }

    private static int calcMaxDivider(int number) {
        for (int i = number / 2; i >=1 ; i--) { // в 6 раз сделали оптимизацию
            howManyIterations++;
            if (number % i == 0) {
                return i;
            }
        }
        return 0;
    }


}