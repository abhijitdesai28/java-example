package loopExercise;
import java.util.Scanner;
public class FactorialOfNumber
{
    //write a pgm to find factorial value of any number
    //1*2*3*4*5
        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Factorial Number : ");
            int num = input.nextInt();
            int fact = 1;
            for(int i=1; i<=num; i++)
            {
                fact =fact* i;
            }
            System.out.println("Factorial: "+ fact);
        }
    }

