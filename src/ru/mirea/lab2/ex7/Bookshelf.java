package ru.mirea.lab2.ex7;

import java.util.Arrays;

public class Bookshelf {
    private Book[] books;

    public Bookshelf(int size) {
        this.books = new Book[size];
    }

    public Book getBook(int index) {
        return this.books[index];
    }
    public void setBook(int index, Book book) {
        this.books[index] = book;
    }

    public Book getEarliest() {
        Book min = books[0];
        for (int i = 1; i < this.books.length; i++) {
            if (books[i].getYear() < min.getYear()){
                min = books[i];
            }
        }

        return min;
    }

    public Book getLatest() {
        Book max = books[0];
        for (int i = 1; i < this.books.length; i++) {
            if (books[i].getYear() > max.getYear()){
                max = books[i];
            }
        }

        return max;
    }

    public void sort() {
        Book temp;

        for (int i = 0; i < this.books.length; i++) {
            for (int j = i + 1; j < this.books.length; j++){
                if (books[i].getYear() > books[j].getYear()) {
                    temp = books[i];
                    books[i] = books[j];
                    books[j] = temp;
                }
            }
        }
    }

    @Override
    public String toString() {
        return "Bookshelf{" +
                "books=" + Arrays.toString(books) +
                '}';
    }
}
