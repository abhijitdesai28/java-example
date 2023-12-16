package loopExercise;

import java.util.Scanner;
public class CountPosNegZeros
{
    //write a pgm to enter the numbers till the user wants and at the end it should display
      // the coun of positive,negative,zeros entered

    //Write a pgm to count of positive ,negative and zeros
        public static void main(String [] args)
        {
            Scanner input = new Scanner(System.in);
            int positive=0, zero=0, negative=0;
            char choice;

            do {
                System.out.println("Enter a number");
                int number=input.nextInt();
                if (number>0)
                {
                    positive++;
                } else if (number<0)
                {
                    negative++;
                }
                else
                {
                    zero++;
                }
                System.out.println("Do u want to continue say Yes or NO");
                choice=input.next().charAt(0);
            }
            while (choice=='y' || choice=='Y');

            System.out.println("positive numbers  "+positive);
            System.out.println("negative numbers  "+negative);
            System.out.println("zeros   "+zero);
        }

}
