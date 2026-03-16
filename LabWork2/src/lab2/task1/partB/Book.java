package lab2.task1.partB;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int publicationYear, int pages) {
        super(title, author, publicationYear);
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + " Book [ numberOfPages= " + numberOfPages + " ]";
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }


}
