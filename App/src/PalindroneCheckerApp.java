public class PalindroneCheckerApp {

    /**
     * Application entry point for UC11.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "madam";

        PalindromeService service = new PalindromeService();

        boolean result = service.checkPalindrome(input);

        if (result) {
            System.out.println(input + " is a Palindrome");
        } else {
            System.out.println(input + " is NOT a Palindrome");
        }
    }
}

/**
 * Service class that contains pali
 * ndrome logic.
 */
class PalindromeService {

    /**
     * Checks whether the input string is a palindrome.
     * @param input Input string
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {

        // Initialize pointers
        int start = 0;
        int end = input.length() - 1;

        // Compare characters moving inward
        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}