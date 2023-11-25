import java.util.Scanner;

public class EqualToOperator
{
    public static void main(String [] args)//
    {
        System.out.println("please enter a value");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        if (Integer.valueOf(input) == 100) {
            System.out.println("goog number");
        } else {
            System.out.println("bad number");
        }
    }

}
