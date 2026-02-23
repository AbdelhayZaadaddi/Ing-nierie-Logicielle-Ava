package ava_6.problem5;

import java.util.LinkedList;

public class BookQueue {
    private LinkedList<Book> list = new LinkedList<>();

    public void enqueue(Book book) {
        list.addLast(book);
    }

    public Book dequeue() {
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