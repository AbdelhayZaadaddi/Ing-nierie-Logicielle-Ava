package ava_6.problem3;

import java.util.ArrayList;

public class Library {
    private int capacity;
    private ArrayList<Document> documents;

    public Library(int capacity) {
        this.capacity = capacity;
        this.documents = new ArrayList<>();
    }

    public boolean add(Document doc) {
        if (documents.size() < capacity) {
            return documents.add(doc);
        }
        return false;
    }

    public boolean delete(Document doc) {
        return documents.remove(doc);
    }

    public Document document(int numEnreg) {
        for (Document d : documents) {
            if (d.getNumRec() == numEnreg)
                return d;
        }
        return null;
    }

    public void displayDocuments() {
        for (Document d : documents)
            System.out.println(d);
    }

    public void displayAuthors() {
        System.out.println("Authors in Library:");
        for (Document d : documents) {
            if (d instanceof Book) {
                System.out.println("- " + ((Book) d).getAuthor());
            }
        }
    }
}