package org.example.whileLoop;

public class WhileLoopPattern2
{
//    print the following pattern
//                    *
//                *   *
//            *   *   *
//        *   *   *   *
//    *   *   *   *   *
// not done

    public static void main(String[] args)
    {
        int row=5;

        while(row>=1)
        {
            int column=5;
            while(column>=row)
            {
                System.out.print("\t*");
                column--;
            }
            System.out.println();
            row++;
        }

    }
}
