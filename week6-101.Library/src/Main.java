public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("griezelbus", "van Loon", 1993));

        library.printBooks();

        System.out.println(StringUtils.included("griezelbus", "griezel"));
    }
}
