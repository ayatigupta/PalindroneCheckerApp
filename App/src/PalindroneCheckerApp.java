public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        // Using StackStrategy (from previous UC)
        PalindromeStrategy strategy = new StackStrategy();

        // Start time
        long startTime = System.nanoTime();

        boolean result = strategy.check(input);

        // End time
        long endTime = System.nanoTime();

        // Calculate execution time
        long duration = endTime - startTime;

        System.out.println("Input: " + input);
        System.out.println("Is Palindrome?: " + result);
        System.out.println("Execution Time: " + duration + " ns");
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

    public boolean check(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}