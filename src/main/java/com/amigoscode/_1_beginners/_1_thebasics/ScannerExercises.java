package com.amigoscode._1_beginners._1_thebasics;

import java.util.Scanner;

/**
 * Exercise: Scanner (User Input)
 *
 * Learn how to read user input from the console using the Scanner class.
 * Scanner allows your programs to be interactive by accepting input at runtime.
 */
public class ScannerExercises {

    public static void main(String[] args) {

        // TODO: 1 - Create a Scanner object to read from System.in
        // Hint: Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);

        // TODO: 2 - Prompt the user for their name and read it using nextLine()
        // Print "Enter your name: " then read the input into a String variable.
        // Hint: Use System.out.print() (not println) for the prompt so the cursor
        //       stays on the same line.

        System.out.print("enter your name: ");
        String str = scanner.nextLine();

        // TODO: 3 - Prompt the user for their age and read it using nextInt()
        // Print "Enter your age: " then read the input into an int variable.
        // Note: After nextInt(), the newline character remains in the buffer.

        System.out.print("enter your age: ");
        int a = scanner.nextInt();
        // TODO: 4 - Print a greeting using the name and age
        // Example output: "Hello, Alice! You are 25 years old."
        System.out.println("hello "+str + "! You are "+a+" years old.");

        // TODO: 5 - Prompt the user for two numbers, read them, and print their sum
        // Print "Enter first number: ", read it.
        // Print "Enter second number: ", read it.
        // Print "Sum: " followed by the result.
        System.out.println("enter the 1st number: ");
        int n1 = scanner.nextInt();
        System.out.println("enter the 2nd number: ");
        int n2 = scanner.nextInt();
        System.out.println("sum: "+ (n1+n2));

        // TODO: 6 - Close the scanner to free resources
        // Hint: scanner.close();

    }
}
