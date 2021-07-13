package org.example;

public class Unit1Main {
    public static void main(String[] args) {
        Book book = new Book("Ivanov", "name1", 1937);
        Student student = new Student("Ivan", "iv1990@gmail.com", book);
        student.print();
    }
}
