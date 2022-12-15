package Lessons.Lesson9;

public class LangTest {
    public static void main(String[] args) {
        String lang = "EN";
        if (lang.equals("EN")) {
            System.out.println("Hello");
        } else if (lang.equals("GE")) {
            System.out.println("Halo");
        } else if (lang.equals("SP")) {
            System.out.println("Hola");
        } else {
            System.out.println("not supported");
        }

        switch (lang) {
            case "EN" -> System.out.println("Hello");
            case "GE" -> System.out.println("Halo");
            case "SP" -> System.out.println("Hola");
            default -> System.out.println("not supported");
        }

        int month = 5;
        switch (month) {
            case 3, 4, 5: {
                if (lang.equals("EN")) {
                    System.out.println("Spring");
                } else {
                    System.out.println("Весна");
                }
            }
        }

        // Редкий кейс применяемый с Object на Java 17:

        // Object o = "Str";
        // o = 12;
        // switch (o) {
        //     case Integer i -> System.out.println("int");
        //     case String s -> System.out.println("string");
        //     default -> System.out.println("");
        // }
    }
}
