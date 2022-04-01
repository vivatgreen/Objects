package ru.skypro.course1.homework1;
public class Book {
    String name;
    Author author;
    int year;

    public Book(String name, Author author, int year) {

        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getName() {
        return name;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
}

