// Author: Pavankumar Hegde

// Question: Write a program to display sum of 1 to N numbers?

// Answer :
class Question13 {
    public static void main(String[] args) {
        // if you are using Scanner class then you need to import java.util.Scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("sum of 1 to N numbers is " + sum);
    }
}
