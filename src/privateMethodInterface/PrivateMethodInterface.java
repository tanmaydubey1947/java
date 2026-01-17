package privateMethodInterface;

public interface PrivateMethodInterface {

    void method();

    static void staticMethod() {
        System.out.println("This is a static method in an interface.");
    }

    default void defaultMethod() {
        System.out.println("This is a default method in an interface.");
        privateMethod();
    }

    private void privateMethod() {
        System.out.println("This is a private method in an interface.");
    }
}
