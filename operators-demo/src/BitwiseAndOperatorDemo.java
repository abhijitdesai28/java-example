import java.util.Scanner;

public class BitwiseAndOperatorDemo
{
    static int firstNumber=0;
    static int  secondNumber=0;

    private static void bitwiseAndOpertor()
    {
        int result =firstNumber & secondNumber;
        System.out.println("bitwise And result "+ result);
    }

    public static void main(String[] args)
    {
        System.out.println("enter two value");
        Scanner scanner = new Scanner(System.in);
        firstNumber = Integer.valueOf(scanner.nextLine());
        secondNumber = Integer.valueOf(scanner.nextLine());

        bitwiseAndOpertor();


    }

}
