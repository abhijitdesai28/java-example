package org.example.whileLoop;

public class WhileLoopPattern4
{
//    print the following pattern
//
////    *   *   *   *   *
//      *   *   *   *
//      *   *   *
//      *   *
//      *
// done

    public static void main(String[] args)
    {
        int row=5;
        while(row>=1)
        {
            int col=1;
            while(col<=row)
            {
                System.out.print("*\t");
                col++;
            }
            System.out.println();
            row--;
        }

    }
}
