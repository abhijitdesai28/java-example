package loopExercise;

import java.util.Scanner;

public class AdditionOfIntegerNumber
{
    //Write java pgm to find addition of n integer numbers
    public static void main(String[] args)
    {
        int n,number,sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a limit :");
        n=input.nextInt();
        for (int i=1;i<=n;++i)
        {
            System.out.println("enter a number :");

            number=input.nextInt();
            sum=sum+number;
        }
        System.out.println("sum of given number "+sum);
    }
}
