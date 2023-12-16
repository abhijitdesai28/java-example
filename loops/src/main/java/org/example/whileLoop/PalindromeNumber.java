package org.example.whileLoop;

import java.util.Scanner;

public class PalindromeNumber
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int input = sc.nextInt();
        int temp = input;
        int rev = 0;
        while (input != 0) {
            rev = rev * 10 + (input % 10);
            input = input / 10;
        }
        if (rev == temp) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome number");
        }
    }
}
