// Author: Pavankumar Hegde

// Question :1. How do you reverse a string in Java?

// Answer:

public class Question1 {
    public static void main(String[] args) {
        String str = "Pavankumar Hegde";

        // conversion from String object to StringBuffer
        StringBuffer sbr = new StringBuffer(str);
        // To reverse the string
        sbr.reverse();
        System.out.println("The reversed string is: " + sbr);
    }
}
