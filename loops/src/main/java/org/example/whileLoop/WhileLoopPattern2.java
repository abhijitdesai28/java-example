package org.example.whileLoop;

public class WhileLoopPattern2
{
//    print the following pattern
//                    *
//                *   *
//            *   *   *
//        *   *   *   *
//    *   *   *   *   *
// done

    public static void main(String[] args)
    {
        int row=5;

        int i = 1;
        while (i <= row) {
            int j = 1;
            while (j <= row) {
                if (j <= row - i) {
                    System.out.print("  "); // Print spaces
                } else {
                    System.out.print("* ");
                }
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
