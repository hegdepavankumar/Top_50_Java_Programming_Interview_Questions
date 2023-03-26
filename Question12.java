// Author: Pavankumar Hegde
// Question: Write a program to Print REVERSE of N to 1 numbers?
// Answer :

class Question12 {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("enter value of n");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}