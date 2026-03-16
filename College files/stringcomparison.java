public class stringcomparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        // Using '==' operator (compares references)
        System.out.println("str1 == str2: " + (str1 == str2)); // true
        System.out.println("str1 == str3: " + (str1 == str3)); // false

        // Using .equals() method (compares values)
        System.out.println("str1.equals(str2): " + str1.equals(str2)); // true
        System.out.println("str1.equals(str3): " + str1.equals(str3)); // true

        // Using .compareTo() method (lexicographical comparison)
        String str4 = "Apple";
        String str5 = "Banana";
        System.out.println("str4.compareTo(str5): " + str4.compareTo(str5)); // negative value
        System.out.println("str5.compareTo(str4): " + str5.compareTo(str4)); // positive value
        System.out.println("str1.compareTo(str2): " + str1.compareTo(str2)); // 0
    }
}