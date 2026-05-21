
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Print a message
        System.out.println("Hello, World!");

        // Take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Print personalized greeting
        System.out.println("Welcome, " + name + "!");
        
        scanner.close();
    }
}
