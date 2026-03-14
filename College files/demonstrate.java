public class demonstrate {
    {
        public static void main(String[] args) {
            try {
                int[] arr = {1, 2, 3};
                int a = 10 / 0; // This will throw ArithmeticException
                System.out.println(arr[5]); // This would throw ArrayIndexOutOfBoundsException
            } catch (ArithmeticException e) {
                System.out.println("Caught ArithmeticException: " + e.getMessage());
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
            }
        }
    }
    
}
