package loopExercise;
import java.util.Scanner;
public class SumNumber
{
    // write a pgm to find sum of all natural numbers between 1 to n
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter The Number of Limit : ");
            int l =input.nextInt();
            int sum = 0;
            for(int s=1;s<=l;s++)
            {
                sum = sum + s;

            }
            System.out.println("Sum of Numbers :"+sum);
        }
    }

