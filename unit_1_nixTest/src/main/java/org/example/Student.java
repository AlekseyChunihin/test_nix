package org.example;

public class Student {
    private String name;
    private String email;
    private Book book;

    public Student(String name, String email, Book book) {
        this.name = name;
        this.email = email;
        this.book = book;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name= '" + name + '\'' +
                '}';
    }

    public void print() {
        System.out.println("Студент " + name + " имеет следующий аддрес электронной почты:" + email +
                "\n и учится по книге " + book);
    }
}
