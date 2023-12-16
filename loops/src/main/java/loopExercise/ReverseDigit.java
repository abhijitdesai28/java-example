package loopExercise;
import java.util.Scanner;
public class ReverseDigit
{
    //Write a pgm to reverse the given digit

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the Digits :");
            int num = input.nextInt();
            int a = num;
            int rev = 0;
            int rem = 0;
            while(num>0)
            {
                rem = num % 10;
                rev = rev * 10 + rem;
                num /= 10;
            }
            System.out.println("Given Digits :" + a);
            System.out.println("Reverse Digits :" + rev);
        }
    }

