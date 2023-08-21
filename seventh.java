public class seventh {
    public static void main(String args[]) {
        String a = "abc";
        String b = "xyz";
        System.out.println("Before swap: " + a + " " + b);
        a = a + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After : " + a + " " + b);
    }
}
