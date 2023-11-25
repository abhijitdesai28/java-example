import java.util.Scanner;

public class NotEqualToOperator
{
//      Psuedo Code:
//      if (no is not equal to 100)
//         ?print good number
//         :print bad number

    public static void main(String [] args)//
    {
        System.out.println("please enter a value");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) != 100) {
            System.out.println("good number");
        } else {
            System.out.println("bad number");
        }
    }
}
