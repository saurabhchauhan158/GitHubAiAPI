package com.Saurabh.GitHubAiAPI;

import java.util.ArrayList;

public class StringManipulation {
    public static void main(String[] args) {
        // Step 1: Declare dummy string with value "Mathworks India Private Limited"
        String dummyString = "Mathworks India Private Limited";
        System.out.println("Original String: " + dummyString);

        // Step 2: Find vowels in the string
        String vowels = findVowels(dummyString);
        System.out.println("Vowels in the String: " + vowels);

        // Step 3: Reverse the string
        String reversedString = new StringBuilder(dummyString).reverse().toString();
        System.out.println("Reversed String: " + reversedString);

        // Step 4: Find a substring from index 3-9
        String substring = dummyString.substring(3, 10); // endIndex is exclusive
        System.out.println("Substring from index 3 to 9: " + substring);

        // Step 5: Convert the string into an array of strings
        String[] stringArray = dummyString.split(" ");
        System.out.println("Array of Strings:");
        for (String str : stringArray) {
            System.out.println(str);
        }

        // Step 6: Convert the array into an ArrayList and display
        ArrayList<String> stringArrayList = new ArrayList<>();
        for (String str : stringArray) {
            stringArrayList.add(str);
        }
        System.out.println("ArrayList of Strings: " + stringArrayList);

        // Check if the string is a palindrome
        boolean isPalindrome = isPalindrome(dummyString);
        System.out.println("Is the string a palindrome? " + isPalindrome);
    }

    // Helper method to find vowels in the string
    public static String findVowels(String input) {
        StringBuilder vowels = new StringBuilder();
        for (char c : input.toLowerCase().toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels.append(c);
            }
        }
        return vowels.toString();
    }

    // Helper method to check if a string is a palindrome
    // Note: This method is not efficient. It is used to demonstrate the use of regular expressions.
    public static boolean isPalindrome(String input) {
        String cleanedInput = input.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversedInput = new StringBuilder(cleanedInput).reverse().toString();
        return cleanedInput.equals(reversedInput);
    }
}