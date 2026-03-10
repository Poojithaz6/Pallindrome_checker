/**
 * PalindromeChecker App – UC11
 *
 * Demonstrates an object-oriented approach to checking palindromes.
 * Encapsulates logic in a class and exposes checkPalindrome() method.
 */

import java.util.Scanner;
import java.util.Stack;

// PalindromeChecker class encapsulates palindrome logic
class PalindromeChecker {

    // Constructor
    public PalindromeChecker() {
        // No initialization needed for this example
    }

    /**
     * Checks if a given string is a palindrome (case-insensitive & spaces ignored)
     *
     * @param input String to check
     * @return true if palindrome, false otherwise
     */
    public boolean checkPalindrome(String input) {
        if (input == null) return false;

        // Normalize: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Using Stack to demonstrate OOP + data structure
        Stack<Character> stack = new Stack<>();
        for (char ch : normalized.toCharArray()) {
            stack.push(ch);
        }

        for (char ch : normalized.toCharArray()) {
            if (ch != stack.pop()) {
                return false; // mismatch found
            }
        }

        return true; // matched all characters
    }
}

// Main application class
class PalindromeCheckerAppUC11 {

    public static void main(String[] args) {

        String input = "racecar";
        System.out.print("Input: "+ input);

        // Use the PalindromeChecker service
        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("\nIs palindrome?: True");
        } else {
            System.out.println("\nIs palindrome? : False");
        }

    }
}