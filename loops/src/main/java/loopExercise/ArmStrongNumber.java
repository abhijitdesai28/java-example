package loopExercise;
import java.util.Scanner;
public class ArmStrongNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number");
        int n=input.nextInt();
        int rem, t=n,p=0;
        while(n>0)
         {
            rem=n%10;
            p=p+(rem* rem*rem);
            n=n/10;
         }
         if(t==p)
              {
               System.out.println("armstrong number "+p);
               }
         else
             {
                 System.out.println("not armstrong number "+p);
             }
    }
}