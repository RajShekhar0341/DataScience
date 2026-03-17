public class GlobalConstant {
    
    // String constants
    public static final String APP_NAME = "MyApplication";
    public static final String APP_VERSION = "1.0.0";
    
    // Numeric constants
    public static final int MAX_USERS = 100;
    public static final double PI = 3.14159;
    
    // Boolean constants
    public static final boolean DEBUG_MODE = true;
    
    // Private constructor to prevent instantiation
    private GlobalConstant() {
        throw new AssertionError("Cannot instantiate GlobalConstant class");
    }
}