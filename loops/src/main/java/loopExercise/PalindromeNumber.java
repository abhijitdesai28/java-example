package loopExercise;

import java.util.Scanner;

public class PalindromeNumber
{
    //Write a pgm to check given number is palindrome or not
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = input.nextInt();
        int rev=0,rem,temp;
        temp=num;
        while (num!=0)
        {
            rem=num%10;
            rev=rev=rev*10+rem;
            num=num/10;
        }
        if (temp==rev)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not a palindrome number");
        }
    }
}
