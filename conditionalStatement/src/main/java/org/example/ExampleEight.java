package org.example;
import java.util.Scanner;
public class ExampleEight
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("input an alphabet :");
        String input = sc.next().toLowerCase();

        boolean  uppercase =input.charAt(0)>=65 && input.charAt(0)<=90;
        boolean lowercase = input.charAt(0)>=97 && input.charAt(0)<=122;
        boolean vowels =input.equals("a") ||input.equals("e")
                ||input.equals("i") ||input.equals("o") || input.equals("u");

        if(input.length()>1)
        {
            System.out.println("u have given input as string-not allowed");
        } else if (!(uppercase || lowercase))
        {
            System.out.println("error-not a letter.enter uppercase or lowercase letter");
        } else if (vowels)
        {
            System.out.println("letter is vowel");
        }
        else
        {
            System.out.println("letter is consonant");
        }
    }
}
