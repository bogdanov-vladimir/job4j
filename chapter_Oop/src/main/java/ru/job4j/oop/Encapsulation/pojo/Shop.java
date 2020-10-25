package ru.job4j.oop.encapsulation.pojo;

public class Shop {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new Book("Book0", 15);
        books[1] = new Book("Book1", 5);
        books[2] = null;
        books[3] = null;
        books[4] = new Book("Book4", 50);

        for (int i = 0; i < books.length; i++) {
            if(books[i] == null) {
                delete(books, i);
            }
        }


        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                System.out.println("i = " + i + " = null");
            } else {
                System.out.println("i = " + i + " = " + books[i].getName());
            }
        }
    }

    private static void delete(Book[] books, int index) {

        for (int i = index; i < books.length - 1; i++) {
            books[i] = books[i + 1];
        }

        books[books.length - 1] = null;
    }
}
