import java.util.Scanner;

public class TernaryOperatorDemo
{
//   Pseudo Code:
//   accept the no as input
//        check if no is less tan 0
//        print -negative number
//        else - positive number

    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        System.out.println((input <0) ? "negative number" : "positive number");
    }
}
