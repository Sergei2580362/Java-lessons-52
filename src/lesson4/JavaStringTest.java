package lesson4;

public class JavaStringTest {
    // 1. Создайте строку I study Basic Java!
    // 2. Распечатать последний символ строки. Исполуем метод String.charAt().
    // 3. Проверить, содерджит ли ваша строка подствроку "Java". Изпользуем метод String.contains().
    // 4. Заменить все символы "а" на "о".
    // 5. Преобразуйте строку к верхнему регистру.
    // 6. Преобразуйте строку к нижнему регистру.
    // 7. Вырезать строку Java с помощью метода String.substring().
    // 8. Напишите прогрумму для подсчета какой индекс у символа 'd'.
    // 9. Напишите программу, которая спрашивает имя и считывает его с консоли с помощью Scanner и после пишет на консоль "Hello ..... !" (вместо многоточия имя)
    // 10. Напишите программу, которая спрашивает имя и считывает его с консоли с помощью java/util/Scanner  и после пишет "Ваше имя начинается с буквы ..."

    public static void main(String[] args) {
        String str = "I study Basic Java!";
        System.out.println(str);
        System.out.println(str.lastIndexOf('!'));
        System.out.println(str.charAt(18)); // вар.2 (str.charAt(str.lenth() - 1));
        System.out.println(str.contains("Java"));
        System.out.println(str.replace('a', 'o'));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.substring(str.indexOf("Java")));
        System.out.println(str.indexOf('d'));

    }

}
