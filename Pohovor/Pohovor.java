public class Pohovor {
    public static void main(String[] args) {
        String a = "Hello";
        final String b = "Hel";
        String c = "lo";
        System.out.println(a == b + c);

        System.out.println(a.equals(b + "lo"));
    }
}
