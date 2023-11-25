import java.util.Scanner;

public class LogicalOrOperatorDemo
{
//    Psuedo Code:
//    if (no is greater than 0 OR no is less than 1000)
//        ? print Condition matching all good
//        :print Condition not matching -all not good

    public static void main(String[] args)
    {
        System.out.println("Please enter value");
        Scanner scanner = new Scanner(System.in);
        String input =scanner.nextLine();

        if(Integer.valueOf(input) > 0 || Integer.valueOf(input)<1000)
        {
            System.out.println("condition matching all good");
        }
        else {
            System.out.print("condition not matching -all not good");
        }
    }
}
