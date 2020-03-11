package ru.job4j.oop.encapsulation.pojo;

public class Shop {
    public static void main(String[] args) {
        Book[] books = new Book[5];

        books[0] = new ru.job4j.oop.encapsulation.pojo.Book("Book0", 15);
        books[1] = new Book("Book1", 5);
        books[2] = null;
        books[3] = null;
        books[4] = new Book("Book4", 50);

        for (int i = 0; i < books.length; i++) {
            delete(books, i);
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

        if (books[index] == null) {
            for (int j = 0; j < books.length; j++) {
                int jNext = (books.length - 1) - j;

                if (books[jNext] == null || jNext < index) {
                    continue;
                }

                books[index] = books[jNext];
                books[jNext] = null;
                break;
            }
        }
    }
}
