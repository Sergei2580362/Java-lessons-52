package Lesson8;

public class BooleanTest {
    public static void main(String[] args) {
        boolean isMoreOrEquals = 5 <= 7; // <=, >= (правильное написание)
        boolean isEquals = 8 == 7;
        // четное или нет -> делится ли на 2 -> остаток от деления на 2 равен ли нулю
        boolean isEven = 9 % 2 == 0;
        boolean isNotDivBy3 = 10 % 3 != 0; // остаток от деления не равен 0
        System.out.println(isEven);
        int i = 7;
        boolean isDiv2or3 = (i % 2 == 0) || (i % 3 == 0);
        boolean isDiv2and3 = (i % 2 == 0) && (i % 3 == 0);

        // 1011
        // побитовый сдвиг (умножить на два десять (или сколько надо) раз)
        int num = 11;
        num = num<<10;
        //Math.pow(2,10); - возведение в степень (2 в 10-й степени); сокр. "pow" - это 2 power of 10
        //System.out.println(num);

        // написать метод который будет возвращать ответ на вопрос делится ли число на 3 и не делится на 5
        System.out.println(isDiv3andNot5(9));
    }
    public static boolean isDiv3andNot5(int num) {
        return (num % 3 == 0) && (num % 5 != 0);
    }
}
