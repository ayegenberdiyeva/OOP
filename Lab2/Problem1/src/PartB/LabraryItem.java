package PartB;

public abstract class LabraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LabraryItem(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String toString(){
        return "Title: " + title
                + ", Author: " + author
                + ", Publication Year: " + publicationYear;
    };
}
