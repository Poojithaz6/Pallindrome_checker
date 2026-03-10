import java.util.Scanner;

class PalindromeCheckerApp {

    // Main method – entry point
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the PalindromeChecker App (UC10)");
        System.out.print("Enter a string to check: ");

        String input = scanner.nextLine();

        if (isPalindromeIgnoreCaseAndSpaces(input)) {
            System.out.println("The input is a palindrome (case-insensitive & spaces ignored).");
        } else {
            System.out.println("The input is NOT a palindrome.");
        }

        System.out.println("Application terminated.");
        scanner.close();
    }
    public static boolean isPalindromeIgnoreCaseAndSpaces(String str) {
        if (str == null) return false;

        // Normalize: remove spaces and convert to lowercase
        String normalized = str.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome using two-pointer technique
        int left = 0;
        int right = normalized.length() - 1;

        while (left < right) {
            if (normalized.charAt(left) != normalized.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }

        return true; // matched all characters
    }
}