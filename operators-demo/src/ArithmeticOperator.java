import java.util.Scanner;
public class ArithmeticOperator
{
    int firstNumber;
    int secondNumber;

    void addition()
    {
        int total= firstNumber + secondNumber;
        System.out.println("total of 2 no="+ total);
    }
    void subtraction()
    {
        int subtraction= firstNumber - secondNumber;
        System.out.println("subtraction of 2 no="+ subtraction);
    }
    void multiplication()
    {
        int multiplication= firstNumber * secondNumber;
        System.out.println("multiplication of 2 no="+ multiplication);
    }
    void division()
    {
        int division= firstNumber / secondNumber;
        System.out.println("division of 2 no="+ division);
    }
    void modulo()
    {
        int modulo= firstNumber % secondNumber;
        System.out.println("modulo of 2 no="+ modulo);
    }

    public static void main(String[] args)
    {
        System.out.println("enter two number");
        Scanner sc = new Scanner(System.in);
        String firstinput=sc.nextLine();
        String secondinput =sc.nextLine();

        ArithmeticOperator arithmeticOperator = new ArithmeticOperator();
        arithmeticOperator.firstNumber=Integer.valueOf(firstinput);
        arithmeticOperator.secondNumber=Integer.valueOf(secondinput);
        // arithmeticOperator.firstNumber=5;
        //  arithmeticOperator.secondNumber=4;
        arithmeticOperator.addition();//9
        arithmeticOperator.subtraction();//1
        arithmeticOperator.multiplication();//20
        arithmeticOperator.division();//1
        arithmeticOperator.modulo();//1
    }
}