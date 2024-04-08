package com.bosiy;

public class MainApplication {
    public static void main(String[] args) {
        Reader alex = new Reader("Alex Chef", 375,
                "Computer Science", "21.12.1996",
                "0974331287");

        System.out.println(alex);
        System.out.println();

        alex.takeBook(3);
        alex.takeBook("Пригоди", "Словник", "Енциклопедія");
        alex.takeBook(new Book("Shine", "S. King"),
                new Book("Pet cemetery", "S. King"));

        System.out.println();

        alex.returnBook(1);
        alex.returnBook("Пригоди");
        alex.returnBook(new Book("Black hole", "S. Hawking"));
    }
}
