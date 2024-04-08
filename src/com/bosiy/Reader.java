package com.bosiy;

public class Reader {
    private final String fullName;
    private final int ticketNumber;
    private final String faculty;
    private final String birthDate;
    private final String phoneNumber;

    public Reader(String fullName, int ticketNumber, String faculty,
                  String birthDate, String phoneNumber) {
        this.fullName = fullName;
        this.ticketNumber = ticketNumber;
        this.faculty = faculty;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    public void takeBook(int countOfBook) {
        String bookString = isSingleBook(countOfBook) ? " book" : " books";
        System.out.println(fullName + " takes a " + countOfBook + bookString + ". ");
    }

    public void takeBook(String... nameOfBooks) {
        String bookString = isSingleBook(nameOfBooks.length) ? " book:" : " books:";
        StringBuilder books = new StringBuilder(" ");

        for (int bookNumber = 0; bookNumber < nameOfBooks.length; bookNumber++) {
            books.append(nameOfBooks[bookNumber]);
            books.append(nameOfBooks.length - 1 == bookNumber ? ". " : ", ");
        }

        System.out.println(fullName + " take this" + bookString + books);
    }

    public void takeBook(Book... books) {
        String bookString = isSingleBook(books.length) ? " book:" : " books:";
        StringBuilder listOfBooks = new StringBuilder(" ");

        for (int bookNumber = 0; bookNumber < books.length; bookNumber++) {
            listOfBooks.append(books[bookNumber].getTitle());
            listOfBooks.append(books.length - 1 == bookNumber ? ". " : ", ");
        }

        System.out.println(fullName + " take this" + bookString + listOfBooks);
    }

    public void returnBook(int countOfBook) {
        String bookString = isSingleBook(countOfBook) ? " book" : " books";
        System.out.println(fullName + " returned " + countOfBook + bookString + ". ");
    }

    public void returnBook(String... nameOfBook) {
        String bookString = isSingleBook(nameOfBook.length) ? " book:" : " books:";
        StringBuilder books = new StringBuilder(" ");

        for (int bookNumber = 0; bookNumber < nameOfBook.length; bookNumber++) {
            books.append(nameOfBook[bookNumber]);
            books.append(nameOfBook.length - 1 == bookNumber ? ". " : ", ");
        }
        System.out.println(fullName + " returned"
                + bookString + books);
    }

    public void returnBook(Book... nameOfBook) {
        String bookString = isSingleBook(nameOfBook.length) ? " book:" : " books:";
        StringBuilder books = new StringBuilder(" ");

        for (int bookNumber = 0; bookNumber < nameOfBook.length; bookNumber++) {
            books.append(nameOfBook[bookNumber].getTitle());
            books.append(nameOfBook.length - 1 == bookNumber ? ". " : ", ");
        }
        System.out.println(fullName + " returned"
                + bookString + books);
    }

    private boolean isSingleBook(int quantity) {
        return quantity == 1;
    }

    @Override
    public String toString() {
        return "Name: " + fullName + "\nNumber of ticket: " + ticketNumber
                + "\nFaculty: " + faculty + "\nDate of birthday: " + birthDate
                + "\nPhone number " + phoneNumber;
    }
}
