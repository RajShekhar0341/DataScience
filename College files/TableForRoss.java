import java.util.Scanner;

public class TableForRoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, count;

        // Ask Ross for input
        System.out.print("Hi Ross! Which number table do you want to learn? ");
        num = sc.nextInt();

        System.out.print("Up to which count do you want the table? ");
        count = sc.nextInt();

        System.out.println("\nGreat! Here is the table of " + num + ":\n");

        // Loop to print table
        for (int i = 1; i <= count; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }

        System.out.println("\nKeep practicing, Ross! 😊");

        sc.close();
    }
}