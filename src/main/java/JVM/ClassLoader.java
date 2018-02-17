package JVM;

public class ClassLoader {
    public static void main(String[] args) {
        System.out.println(new ClassLoader().getClass().getClassLoader().getParent().getParent());
        System.out.println(new ClassLoader().getClass().getClassLoader().getParent().getClass().getName());
        System.out.println(new ClassLoader().getClass().getClassLoader().getClass().getName());
    }
}
