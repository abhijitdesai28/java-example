public class ExampleNine
{

        public static void main(String[] args)
        {
            //Initialize value
            int a =4;
            int b=6;

            //bitwise AND
            System.out.println("a&b =" +(a&b));
                                  //a--> 0100
                                  //b--> 0110
                                  //-----------
                                 //      0100=4

            //Bitwise OR
            System.out.println("a||b =" +(a|b));
                                 //a-->0100
                                 //b-->0110
                                 //-----------
                                 //    0110=6

            //Bitwise XOR
            //if corresponding bits are different, it gives 1, else it shows 0.
            System.out.println("a^b="+ (a^b));
                                //a-->0100
                                //b-->0110
                                //------------
                                //    0010=2

            //Bitwise complement(~)
            //with all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
            System.out.println("~a "+(~a));
                                //a--> 0100 =4 
            //00000000 00000000 00000000 00000100
            //1st = 111111111 11111111 11111111 11111011
            //2nd                                     +1
            //------------------------------------------
            //       11111111 11111111 11111111 11111100

        }


}
