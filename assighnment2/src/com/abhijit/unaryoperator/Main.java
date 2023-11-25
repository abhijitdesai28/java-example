package com.abhijit.unaryoperator;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner sc = new Scanner(System.in);
        String firstValue = sc.nextLine();
        int no=Integer.valueOf(firstValue);

        PreIncrement preIncrement = new PreIncrement();
     //   int no=Integer.valueOf(firstValue);
        preIncrement.preIncrement(no);

        PostIncrement postIncrement = new PostIncrement();
      //  int no1=Integer.valueOf(firstValue);
        postIncrement.postIncrement(no);

        PreDecrement preDecrement = new PreDecrement();
      //  int no2=Integer.valueOf(firstValue);
        preDecrement.preDecrement(no);

        PostDecrement postDecrement = new PostDecrement();
     //   int no3=Integer.valueOf(firstValue);
        postDecrement.postDecrement(no);

        Complement complement = new Complement();
        complement.complement(no);

        Negation negation = new Negation();
        negation.negation(true);

    }
}
