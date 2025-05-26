import java.util.*;
public class loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        int sum = 0;

        // Loop from 1 to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }

        // Print the result
        System.out.println("Sum of even numbers from 1 to " + n + " is: " + sum);

        scanner.close();
    }
    }
    

