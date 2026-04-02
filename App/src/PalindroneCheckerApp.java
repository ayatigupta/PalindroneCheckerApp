public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        StackStrategy strategy = new StackStrategy();

        boolean result = strategy.check(input);

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
    }
}

/**
 * Strategy interface
 */
interface PalindromeStrategy {
    boolean check(String input);
}

/**
 * Stack-based implementation
 */
class StackStrategy implements PalindromeStrategy {

    /**
     * Implements palindrome validation using Stack.
     */
    public boolean check(String input) {

        // Create a stack to store characters
        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push each character onto the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Compare characters by popping from stack
        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}