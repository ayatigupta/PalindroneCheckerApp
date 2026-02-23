import java.util.Queue;
import java.util.LinkedList;
import java.util.Stack;

/*
 * =========================================================
 * MAIN CLASS - UseCase6PalindromeCheckerApp
 * =========================================================
 * Use Case 6: Queue + Stack Palindrome Check
 *
 * Description:
 * This class demonstrates palindrome validation using
 * two different data structures:
 * - Queue (FIFO - First In First Out)
 * - Stack (LIFO - Last In First Out)
 *
 * Characters are inserted into both structures.
 * Then dequeue (queue) and pop (stack) are compared.
 *
 * Author: Developer
 * Version: 6.0
 */

public class PalindroneCheckerApp {

    /*
     * Application entry point for UC6
     * @param args command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string
        String input = "civic";

        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);     // Enqueue
            stack.push(c);    // Push
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Compare characters until queue becomes empty
        while (!queue.isEmpty()) {
            if (queue.remove() != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}