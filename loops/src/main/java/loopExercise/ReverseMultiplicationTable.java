package loopExercise;
import java.util.Scanner;
public class ReverseMultiplicationTable
{
    //write a pgm to print reverse multiplication table

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Starting Number : ");
        int s = input.nextInt();
        System.out.print("Enter The Ending Number : ");
        int e = input.nextInt();
        System.out.print("Enter The Tables Number : ");
        int t = input.nextInt();
        while (s >= e) {
            System.out.println(s + " * " + t + " = " + (s * t));
            s--;
        }
    }
}
