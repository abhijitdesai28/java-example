package loopExercise;

import java.util.Scanner;

public class FactorsOfPositive
{
    //write a pgm to print factors of positive integer

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Positive  Number : ");
        int num = input.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i);
            }
        }
    }
}
