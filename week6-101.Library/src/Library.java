import java.util.ArrayList;

public class Library {
    private ArrayList<Book> listOfBooks;

    public Library(){
        this.listOfBooks = new ArrayList<Book>();
    }

    public void addBook(Book newBook) {
        this.listOfBooks.add(newBook);
    }

    public void printBooks() {
        for (Book book : listOfBooks) {
            System.out.println(book);
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> searchResults = new ArrayList<Book>();

        for (Book book : listOfBooks) {
            if(StringUtils.included(book.title(), title)) searchResults.add(book);
        }

        return searchResults;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> searchResults = new ArrayList<Book>();

        for (Book book : listOfBooks) {
            if(StringUtils.included(book.publisher(), publisher)) searchResults.add(book);
        }

        return searchResults;
    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> searchResults = new ArrayList<Book>();

        for(Book book : listOfBooks) {
            if(book.year() == year) searchResults.add(book);
        }

        return searchResults;
    }
}
