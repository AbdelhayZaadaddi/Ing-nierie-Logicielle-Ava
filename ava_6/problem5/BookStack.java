package ava_6.problem5;

import java.util.LinkedList;

public class BookStack {
    private LinkedList<Book> list = new LinkedList<>();

    public void push(Book book) {
        list.addFirst(book);
    }

    public Book pop() {
        return list.removeFirst();
    }

    public Book peek() {
        return list.getFirst();
    }

    public void display() {
        for (Book b : list) {
            System.out.println("- " + b);
        }
    }
}