package ru.job4j.oop.encapsulation.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];

        for (int iBook = 0; iBook < books.length; iBook++) {
            Book book = new Book("Clean code" + (iBook == 0 ? "" : iBook), 130);
            books[iBook] = book;

            System.out.println(iBook + ". " + books[iBook].getName() + ", Страниц: " + books[iBook].getCountPages());
        }

        Book book0 = books[0];
        Book book3 = books[2];
        books[0] = book3;
        books[2] = book0;

        for (int iBook = 0; iBook < books.length; iBook++) {
            if (books[iBook].getName().equals("Clean code")) {
                System.out.println(books[iBook].getName() + ", idx: " + iBook);
            }
        }
    }
}
