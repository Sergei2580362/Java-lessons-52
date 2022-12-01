package lesson2;

public class Task2 {
//    Даны переменные:
//- деньги которые у нас есть - 1000 рублей
//- стоимость пиццы - 230 рублей
//- стоимость жвачки - 26 рублей
//- стоимость конфеты - 2,5 рубля
//    Задача: представим себе что мы зашли в магазин, и наша задача: купить максимум возможных пиц, затем на сдачу купить максимум жвачек,
//    затем на оставшуюся сдачу купить конфет. 
//    В результате нам нужно сделать математический просчет и вывести на консоль примерно вот такую информацию:
//    На эти деньги мы можем купить:
//- 4 пиццы
//- 3 жвачки
//- 0 конфет
//    Сдача с магазина: 2 рубля.
public static void main(String[] args) {
    int money = 1200;
    int pizza = 230;
    int gum = 26;
    double candy = 2.5;

    int howManyPizza = money / pizza;
    int moneyAfterPizza = money % pizza;
    int howManyGum = moneyAfterPizza / gum;
    int moneyAfterGum = moneyAfterPizza % gum;
    int howManyCandy = (int) (moneyAfterGum / candy);
    double moneyAfterCandy = moneyAfterGum % candy;

    System.out.println("Пиццы купили " + howManyPizza + " шт.");
    System.out.println("Жвачек купили " + howManyGum + " шт.");
    System.out.println("Конфет купили " + howManyCandy + " шт.");
    System.out.println("Осталось " + moneyAfterCandy + " р.");



}


}
