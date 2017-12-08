package com.solid;

/**
 * Created by david on 07/04/17.
 */
public class Book implements BookHandler{
    private String authorName;
    private int numOfPages;
    private BookPersistence bookPersistence;

    public Book(String authorName,int numOfPages) {
        this.numOfPages = numOfPages;
        this.authorName = authorName;
        this.bookPersistence = new BookPersistence();
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    public void setNumOfPages(int numOfPages) {
        this.numOfPages = numOfPages;
    }

    @Override
    public void save() {
        this.bookPersistence.save(this);
    }

    @Override
    public String toString() {
        return authorName + " - " + numOfPages;
    }
}
