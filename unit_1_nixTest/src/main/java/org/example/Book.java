package org.example;

public class Book {
    private String author;
    private String nameBook;
    private int dateOfFirstPublishing;

    public Book(String author, String nameBook, int dateOfFirstPublishing) {
        this.author = author;
        this.nameBook = nameBook;
        this.dateOfFirstPublishing = dateOfFirstPublishing;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    public int getDateOfFirstPublishing() {
        return dateOfFirstPublishing;
    }

    public void setDateOfFirstPublishing(int dateOfFirstPublishing) {
        this.dateOfFirstPublishing = dateOfFirstPublishing;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", nameBook='" + nameBook + '\'' +
                ", dateOfFirstPublishing=" + dateOfFirstPublishing +
                '}';
    }
}
