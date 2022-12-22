package Homeworks.Homework9;

public class Hmw1612Lev2 {
    public static void main(String[] args) {

        // Second level:
        // https://github.com/tel-ran-de/java-basic-52/blob/main/src/de/telrun/khakov/rustam/homework/hw10.md
        // 1) написать программу которая выводит результат умножения одного числа на другое, не используя знак умножения.
        // только знаки сложения
        // Подсказка: 5 умножить на 3 = 5+5+5. (используйте цикл)

        System.out.println("Task 1");
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        for (int i = 0; i < num2; i++) {
            result += num1;
            System.out.println(num1);
        }
        System.out.println(result);


        // 2) вывести на консоль среднее значение всех нечетных чисел от 0 до 100
        // Подсказка: сначала нужно в цикле посчитать сумму, после цикла разделить сумму на количество элементов

        System.out.println("------");
        System.out.println("Task 2");
        int sum = 0;
        int count = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                sum += i;
                count++;
            }
        }
        System.out.println("Cреднее значение всех нечетных чисел от 0 до 100: " + (sum / count));


        // 3) Высчитать факториал числа n. Факториал 5 = 1 * 2 * 3 * 4 * 5

        System.out.println("------");
        System.out.println("Task 3");
        int num3 = 5;
        int factorial = 1;
        for (int i = 1; i <= num3; i++) {
            factorial *= i;
        }
        System.out.println("Факториал числа " + num3 + " -> " + factorial);

        // следующие.
        // посмотрите презентацию лекции c методами у String (в конце одной из лекций)
        // 4) Дана строка из 3-х цифр. Найдите сумму этих цифр. То есть сложите как числа первый символ строки,
        // второй и третий.
        // подсказка: используйте for чтобы пройтись по номеру символа, используйте метод length() у строки чтобы
        // пройтись по каждому символу, метод charAt() чтобы достать символ на определенной позиции и метод
        // Integer.parseInt() чтобы перевести в int

        System.out.println("------");
        System.out.println("Task 4");
        String s = "523";
        int sum1 = 0;
        for (int i = 0; i < s.length(); i++) {
            int val = Integer.valueOf(s.charAt(i));
            sum1 += val;
        }
        System.out.println(sum1);

        //}
        
        // 5) Дана строка из 6-ти цифр. Проверьте, что сумма первых трех цифр равняется сумме вторых трех цифр.
        // Если это так - выведите 'да', в противном случае выведите 'нет'.
        // в данной задаче нужно использовать 2 сумматора и дополнительно метод if чтобы проверить когда нам нужно
        // складывать к первому сумматору, а когда ко второму

        System.out.println("------");
        System.out.println("Task 5");
        String s2 = "123456";
        int sum2 = 0;
        int sum3 = 0;
        for (int i = 0; i < s2.length() /2; i++) {
            int val2 = Integer.valueOf(s2.charAt(i));
            sum2 += val2;
        }

        for (int i = s2.length()/2; i < s2.length(); i++) {
            int val2 = Integer.valueOf(s2.charAt(i));
            sum3 += val2;
        }
        if(sum3 == sum2) {
            System.out.println("да " + sum2 + " равно " + sum3);
        } else {
            System.out.println("нет " + sum2 + " не равно " + sum3);
        }
    }
}
