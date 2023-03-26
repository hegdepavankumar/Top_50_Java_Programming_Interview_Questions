// Author:Pavankumar Hegde

// Question 4: Write a Java program to check if the given number is a prime
// number.

// Answer:
public class Question4 {

    public static void main(String[] args) {
        System.out.println(isPrime(5)); // true
        System.out.println(isPrime(49)); // false
    }

    public static boolean isPrime(int n) {
        if (n == 0 || n == 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

}