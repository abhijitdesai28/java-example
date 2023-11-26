import java.util.Scanner;

public class GreaterThanEqualTo
{
//    Pseudo Code:
//    if (no is greater than or equal to 100)
//        ? print good number
//        : print bad number

    public static void main(String [] args)//
    {
        System.out.println("please enter a value");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) >= 100) {
            System.out.println("goog number");
        } else {
            System.out.println("bad number");
        }
    }
}
