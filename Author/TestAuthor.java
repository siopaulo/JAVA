package Author;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Paul", "Paul@something.com", 'm');
        System.out.println(a1);

        a1.setEmail("test");
        System.out.println(a1);
    }
}
