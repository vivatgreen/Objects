package ru.skypro.course1.homework1;

public class Author {
    String authorName;
    String authorSurname;

    public Author(String authorName, String authorSurname) {
        this.authorName = authorName;
        this.authorSurname = authorSurname;
    }
    public String getauthorName() {
        return this.authorName;
    }
    public String getSurname(){
        return this.authorSurname;
    }
}

