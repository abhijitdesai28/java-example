package org.example;

import java.util.Scanner;

public class ExampleSeven
{
    //
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number :");
        int number=sc.nextInt();
        switch (number)
        {
            case 1 : if (number==1)
            {
                System.out.println("MON");
                break;
            }

            case 2 : if (number==2)
            {
                System.out.println("TUE");
                break;
            }

            case 3 : if (number==3)
            {
                System.out.println("WED");
                break;
            }
            case 4 : if (number==4)
            {
                System.out.println("THU");
                break;
            }
            case 5 : if (number==5)
            {
                System.out.println("FRI");
                break;
            }

            case 6 : if (number==6)
            {
                System.out.println("SAT");
                break;
            }

            case 7 : if (number==7)
            {
                System.out.println("SUN");
                break;
            }
        }
        sc.close();
    }
}
