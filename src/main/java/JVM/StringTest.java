package JVM;

public class StringTest {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abx";
        String s3 = new String("abc");
        System.out.println(s1==s2);
        System.out.println(s2 == s3);
        System.out.println(s1.getClass().toString());
    }
}
