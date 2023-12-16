package loopExercise;
import java.util.Scanner;
public class PerfectNumber
{
    //write a pgm to check perfect numbers or not
    //perfect number is equal to the sum of its positive divisors ,except the number
    //itself
    //ex-6 ==1+2+3=6

        static boolean Check_Perfect(int n)
        {
            if (n == 1)
                return false;
            int sum = 1;
            for (int i = 2; i < n; i++) {

                if (n % i == 0) {
                    sum += i;
                }
            }
            if(sum == n)
                return true;

            return false;
        }

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter The Number : ");
            int n = input.nextInt();
            if (Check_Perfect(n))
                System.out.println(n + " is a Perfect Number");
            else
                System.out.println(n + " is not a Perfect Number");
        }
    }

