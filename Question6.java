// Author: Pavankumar Hegde

// Question 6: How do you check whether a string is a palindrome in Java?

// Answer:
// Logic: Compare the first and last character of the string. If they are same,
// then compare the second and second last character and so on. If all the
// characters are same, then the string is a palindrome.

// Time Complexity: O(n)
// Space Complexity: O(1)
/*
 * 
 * boolean checkPalindromeString(String input) {
 * boolean result = true;
 * int length = input.length();
 * 
 * for (int i = 0; i < length/2; i++) {
 * if (input.charAt(i) != input.charAt(length - i - 1)) {
 * result = false;
 * break;
 * }
 * }
 * 
 * return result;
 * }
 */