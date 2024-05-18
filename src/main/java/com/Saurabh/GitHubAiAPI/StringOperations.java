package com.Saurabh.GitHubAiAPI;



import java.util.Scanner;

public class StringOperations {

    // TODO: Add your code here
    public static int countVowels(String input) {
        int vowelCount = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < input.length(); i++) {
            if (vowels.indexOf(input.charAt(i)) != -1) {
                vowelCount++;
            }
        }
        return vowelCount;
    }

    // Method to reerse the input string
    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder(input);
        return reversed.reverse().toString();
    }

    // Metod to replace all vowes in the input sting with '*'
    public static String replaceCharacters(String input) {
        return input.replaceAll("[aeiouAEIOU]", "*");
    }

    // Method to concatenate the original string with the reversed string
    public static String concatenateStrings(String original, String reversed) {
        return original + reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Validate input
        if (input == null || input.isEmpty()) {
            System.out.println("Invald input. Please enter non-empty string.");
            return;
        }

        // Perform operations on the input string
        int vowelCount = countVowels(input);
        String reversedString = reverseString(input);
        String replacedString = replaceCharacters(input);
        String concatenatedString = concatenateStrings(input, reversedString);

        // Display results
        System.out.println("Numbr of vowels: " + vowelCount);
        System.out.println("Reversed string: " + reversedString);
        System.out.println("String with rplaced characters: " + replacedString);
        System.out.println("Cotenated string: " + concatenatedString);

        scanner.close();
    }
}
