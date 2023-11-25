import java.util.Scanner;

public class LogicalAndOperatorDemo
{
//    Pseudo Code:
//    if (no is greater than 0 AND no is less than 100)
//        ? condition matching all good
//        : condition not matching -all not good

    public static void main(String[] args)
    {
        System.out.println("Please enter value");
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        if(Integer.valueOf(input) > 0 && Integer.valueOf(input)<1000)
        {
            System.out.println("condition matching all good");
        }
        else {
            System.out.print("condition not matchin -all not goog");
        }
    }
}
