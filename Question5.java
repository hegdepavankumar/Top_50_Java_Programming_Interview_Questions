// Author: Pavankumar Hegde

// Question 5: Write a Java program to print a Fibonacci sequence using
// recursion.

// Answer:

//Formula: F(n) = F(n-1) + F(n-2)

public class Question5 {

    public static void printFibonacciSequence(int count) {
        int a = 0;
        int b = 1;
        int c = 1;

        for (int i = 1; i <= count; i++) {
            System.out.print(a + ", ");

            a = b;
            b = c;
            c = a + b;
        }
    }

    public static void main(String[] args) {
        printFibonacciSequence(10);
    }

}
// Uncomment the below code to print Fibonacci sequence using recursion

/*
 * public class Question5 {
 * 
 * public static int fibonacci(int count) {
 * if (count <= 1)
 * return count;
 * 
 * return fibonacci(count - 1) + fibonacci(count - 2);
 * }
 * 
 * public static void main(String args[]) {
 * int seqLength = 10;
 * 
 * System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");
 * 
 * for (int i = 0; i < seqLength; i++) {
 * System.out.print(fibonacci(i) + " ");
 * }
 * }
 * 
 * }
 */