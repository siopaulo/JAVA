package Author;

public class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Pohádka", new Author("Petr", "petr@gmail.com", 'm'), 520);
        System.out.println(b1);

        Book b2 = new Book("Pohádka", new Author("Petr", "petr@gmail.com", 'm'), 520, 22);
        System.out.println(b2);

        System.out.println(b2.getQtyInStock());
        System.out.println(b1.getAuthor().getName());
        System.out.println(b1.getAuthorName());
        System.out.println(b1.getAuthorEmail());
        System.out.println(b1.getAuthorGender());
    }
}
