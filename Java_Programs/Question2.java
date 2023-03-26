
// Author: Pavankumar Hegde

// Question 2: How do you swap two numbers without using a third variable in
// Java?

// Answer:
public class Question2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        System.out.println("a is " + a + " and b is " + b);

        // a = a + b;
        // b = a - b; //Method 1
        // a = a - b;

        a = temp;
        a = b; // method 2
        b = temp;
        System.out.println("After swapping, a is " + a + " and b is " + b);
    }

}