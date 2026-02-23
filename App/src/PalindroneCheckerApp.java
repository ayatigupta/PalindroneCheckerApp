public class PalindroneCheckerApp {

    public static void main(String[] args) {

        String input = "madam";  // declare string

        boolean isPalindrone = true;

        for (int i = 0; i < input.length() / 2; i++) {

            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindrone = false;
                break;
            }
        }

        System.out.println("Is it a Palindrome? : " + isPalindrone);
    }
}