import java.util.Scanner;

public class LeftShiftOperator
{
//    Pseudo Code:
//    program to shift bit by 2 to left

    public static void main(String[] args)
    {
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.valueOf(scanner.nextLine());

        System.out.println("Result:"+(input << 2));
    }
}
