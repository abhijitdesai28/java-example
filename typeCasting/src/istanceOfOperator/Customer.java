package istanceOfOperator;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Customer
{
    public static void main(String[] args) {
        //create object
        Hotel h=new Hotel();
        Scanner input= new Scanner(System.in);
        System.out.println("Enter What u Want:\n1-Idly\n2-Dosa\n3-Vada");
        int customerInput = input.nextInt();
        Food obj=h.orderFood(customerInput);

        if(obj instanceof Idly)
        {
            System.out.println("eating idly");
        } else if (obj instanceof Dosa)
        {
            System.out.println("eating dosa");
        } else if (obj instanceof Vada)
        {
            System.out.println("eating vada");
        }

    }
}
