public interface InterfaceL <T> {
    T methodA();

    default void methodB(){
        System.out.println("methodB");
    }
    static void methodC() {
        System.out.println("methodC");
    }
}
