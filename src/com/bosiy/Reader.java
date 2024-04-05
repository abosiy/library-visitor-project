package com.bosiy;

public class Reader {

    private final String fullName;
    private final int numberOfTicket;
    private final String faculty;
    private final String dateOfBirthday;
    private final String phoneNumber;

    public Reader(String fullName, int numberOfTicket, String faculty,
                  String dateOfBirthday, String phoneNumber) {
        this.fullName = fullName;
        this.numberOfTicket = numberOfTicket;
        this.faculty = faculty;
        this.dateOfBirthday = dateOfBirthday;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + "\nNumber of ticket: " + numberOfTicket
                + "\nFaculty: " + faculty + "\nDate of birthday: " + dateOfBirthday
                + "\nPhone number " + phoneNumber;
    }

    public void takeBook(int countOfBook) {
        System.out.println(fullName + " takes a " + countOfBook + " "
                + checkBookQuantity(countOfBook) + ". ");
    }

    private String checkBookQuantity(int quantity) {
        return quantity == 1
                ? "book"
                : "books";
    }

    public void takeBook(String... nameOfBooks) {
        StringBuilder books = new StringBuilder(" ");
        for (int i = 0; i < nameOfBooks.length; i++) {
            books.append(nameOfBooks[i]);
            books.append(getChar(i, nameOfBooks.length - 1));
        }
        System.out.println(fullName + " take this "
                + checkBookQuantity(nameOfBooks.length) + books);
    }

    private String getChar(int currentIndex, int lastIndex) {
        return currentIndex == lastIndex
                ? ". "
                : ", ";
    }

    public void takeBook(Book... nameOfBooks) {
        StringBuilder books = new StringBuilder(" ");
        for (int i = 0; i < nameOfBooks.length; i++) {
            books.append(nameOfBooks[i].getNameOfABook());
            books.append(getChar(i, nameOfBooks.length - 1));
        }
        System.out.println(fullName + " take this "
                + checkBookQuantity(nameOfBooks.length) + books);
    }

    public void returnBook(int countOfBook) {
        System.out.println(fullName + " returned " + countOfBook
                + " " + checkBookQuantity(countOfBook) + ". ");
    }

    public void returnBook(String... nameOfBook) {
        StringBuilder books = new StringBuilder(" ");
        for (int i = 0; i < nameOfBook.length; i++) {
            books.append(nameOfBook[i]);
            books.append(getChar(i, nameOfBook.length - 1));
        }
        System.out.println(fullName + " returned "
                + checkBookQuantity(nameOfBook.length) + books);
    }

    public void returnBook(Book... nameOfBook) {
        StringBuilder books = new StringBuilder(" ");
        for (int i = 0; i < nameOfBook.length; i++) {
            books.append(nameOfBook[i].getNameOfABook());
            books.append(getChar(i, nameOfBook.length - 1));
        }
        System.out.println(fullName + " returned "
                + checkBookQuantity(nameOfBook.length) + books);
    }
}
