package Lesson7;

public class BookTest {
   public static void main(String[] args) {
       Book book = new Book(134, "Garry Potter", "Rouling");
       book.getAuthor(); // узнать автора
       book.setAuthor("Another new author"); // поменять автора
       System.out.println(book.getAuthor());
   }

}
