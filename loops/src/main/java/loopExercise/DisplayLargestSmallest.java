package loopExercise;

import java.util.Scanner;

public class DisplayLargestSmallest
{
    //write a pgm to entered the numbers till the user wants and at the end pgm should
    //display the largest and smallest numbers entered


    //Write a pgm to display the largest and smallest numbers
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int number;
        int maximum =Integer.MAX_VALUE;
        int minimum = Integer.MIN_VALUE;
        char choice;

        do {
            System.out.println("enter a number ");
            number = input.nextInt();
            if (number > maximum) {
                maximum = number;
            }
            if (number < maximum) {
                minimum = number;
            }
            System.out.println("do u want to continue say Yes or NO");
            choice = input.next().charAt(0);

        }
        while (choice=='Y' || choice=='y');
        System.out.println("large number "+maximum);
        System.out.println("small number "+minimum);
    }
}
