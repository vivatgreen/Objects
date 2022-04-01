package ru.skypro.course1.homework1;
public class Book {
    String name;
    Author author;
    int year;

    public Book (String name, Author author, int year) {

        this.name = name;
        this.author = author;
        this.year = year;
    }
    public void setName(String name){ this.name = name;   }
    public String getName(){ return name;}

    public void setAuthor(Author author){ this.author = author;   }
    public Author getAuthor(){ return author;}

    public void setYear (int year) {
        this.year = year;
    }
    public int getYear() {
        return year;
    }
}

