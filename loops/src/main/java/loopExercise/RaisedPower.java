package loopExercise;

import java.util.Scanner;

public class RaisedPower
{
    //Write a java pgm to find the value of one number raised to the power of another
    public static void main(String [] args)
{
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a base number");
    int base =input.nextInt();
    System.out.print("Enter a power number");
    int power =input.nextInt();
    int result=1;
    for (int i =1;i<=power;i++)
    {
        result=result*base;
    }
    System.out.println(result);

}
}
