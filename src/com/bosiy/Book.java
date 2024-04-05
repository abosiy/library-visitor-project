package com.bosiy;

public class Book {

    private String nameOfABook;
    private String author;

    public Book(String nameOfABook, String author) {
        this.nameOfABook = nameOfABook;
        this.author = author;
    }

    public void setNameOfABook(String nameOfABook) {
        this.nameOfABook = nameOfABook;
    }
    public String getNameOfABook() {
        return this.nameOfABook;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return this.author;
    }
}
