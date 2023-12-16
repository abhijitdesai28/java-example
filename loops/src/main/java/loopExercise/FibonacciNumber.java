package loopExercise;
import java.util.Scanner;
public class FibonacciNumber
{
    //Write a pgm to print fibonacci series up to n terms
    //-->5
    //0
    //1
    //1
    //2
    //3
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter The Fibonacci Number : ");
            int num = input.nextInt();
            int a=0, b=1, c=0, i;
            System.out.println("Fibonacci Numbers ... ");
            for(i=1; i<=num; i++)
            {
                System.out.println(c);
                a = b;
                b = c;
                c = a + b;
            }
        }
    }

