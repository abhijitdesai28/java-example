package loopExercise;
import java.util.Scanner;
public class NaturalNumber
{
    //Write a pgm to print all natural numbers from 1to n
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Number : ");
        int s =input.nextInt();
        System.out.print("Enter The Ending Number : ");
        int e =input.nextInt();
        while(s<=e)
        {
            System.out.println(s);
            s++;
        }
    }
}
