package ru.skypro.course1.homework1;

public class Main {
    public static void main(String[] args) {
        Author stephenKing  = new Author("Stephen", "King");
        Book firstBook = new Book("Desperation", stephenKing, 1997);

        Author levTolstoi  = new Author("Толстой", "Лев");
        Book secondBook = new Book("Война и мир", levTolstoi, 1869);
        System.out.println("firstBook = " + firstBook);
        System.out.println("secondBook = " + secondBook);
        secondBook.setYear(1846);
        System.out.println("secondBook.getYear() = " + secondBook.getYear());
    }
}
