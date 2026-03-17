public interface MyInterface {
    // Abstract methods
    void method1();
    
    int method2(String parameter);
    
    // Default method (Java 8+)
    default void method3() {
        System.out.println("Default implementation");
    }
    
    // Static method (Java 8+)
    static void method4() {
        System.out.println("Static method");
    }
}