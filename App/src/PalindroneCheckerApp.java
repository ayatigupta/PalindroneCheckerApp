import java.util.Deque;
import java.util.ArrayDeque;

/*
 * =========================================================
 * MAIN CLASS - UseCase7PalindromeCheckerApp
 * =========================================================
 * Use Case 7: Deque-Based Optimized Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using a Deque
 * (Double Ended Queue).
 *
 * It inserts characters into the deque,
 * then removes from both front and rear
 * and compares them directly.
 *
 * Author: Developer
 * Version: 7.0
 */

public class PalindroneCheckerApp {

    /*
     * Application entry point for UC7
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "radar";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Insert each character into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}