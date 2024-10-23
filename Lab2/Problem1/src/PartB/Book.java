package PartB;

public class Book extends LabraryItem{
    private int numOfPages;

    public Book(String title, String author,int publicationYear, int numOfPages) {
        super(title, author, publicationYear);
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return numOfPages;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", Pages: " + numOfPages;
    }
}
