// Author:Pavankumar Hegde

// Question 3: Write a Java program to check if a vowel is present in a string.

// Answer:
public class Question3 {

    public static void main(String[] args) {
        System.out.println(stringContainsVowels("Pavankumar")); // true
        System.out.println(stringContainsVowels("Hegde")); // true
        System.out.println(stringContainsVowels("Try")); // false
    }

    public static boolean stringContainsVowels(String input) {
        return input.toLowerCase().matches(".*[aeiou].*");
    }

}