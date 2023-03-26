// Author: Pavankumar Hegde

// Question 9: How do you check if two strings are anagrams of each other?

// Answer:

public class Question9 {

    public static void main(String[] args) {

        int num = 6;
        long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}