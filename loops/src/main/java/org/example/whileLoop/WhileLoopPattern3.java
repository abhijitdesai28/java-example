package org.example.whileLoop;

public class WhileLoopPattern3
{
//    print the following pattern
////            #
//            #  #
//          #  #  #
//        #  #  #   #
//      #  #   #   #   #

// not done

    public static void main(String[] args)
    {
        int row=9;

        int i = 1;//is used to control the  outer loop
        while (i <= row)
        {
            int j = 1;//is used to control the inner loop
            int k=1;
            while (j <= row)
            {
               /* if (j >=6-row &&j<=4+row && k)
                {
                    System.out.print("  "); // Print spaces
                    k=0;
                } else
                {
                    System.out.print("* ");
                    k=1;
                }*/
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
