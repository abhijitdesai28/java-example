public class ExampleSeven
{
    public static void main(String[] args){ // main function declaration
        int a,b = 2; // variable declaration and initialization
        a = 11;
        System.out.println(" = Operator : a = " + a); // simple assignment operator  a=11
        a += b;
        System.out.println(" += Operator : a += b is : " + a); // add assignment operator a= a+b;--> a=11+2=13
        a -= b;
        System.out.println(" -= Operator : a -= b is : " + a); // subtract assignment operator   a=a-b;-->13-2=11
        a *= b;
        System.out.println(" *= Operator : a *= b is : " + a); // multiply assignment operator a=a*b;--> a=11*2=22
        a /= b;
        System.out.println(" /= Operator : a /= b is : " + a); // division assignment operator a=a/b;-->a=22/2=11
        a %= b;
        System.out.println(" %= Operator : a %=b is : " + a); // modulus assignment operator  a=a%b;-->a=11%2=1
        a <<= 2;
        System.out.println(" <<= Operator : a <<= 2 is : " + a); // Left shift assignment operator a=1<<2 =4
        a >>= 2;
        System.out.println(" >>= Operator : a >>= 2 is : " + a); // Right shift assignment operator a=4>>2 =1
        a &= b;
        System.out.println(" &= Operator : a &= b is : " + a); // Bitwise AND assignment operator a=a & b; 0
        a |= 2;
        System.out.println(" |= Operator : a |= 2 is : " + a); // Bitwise OR assignment operator a=a|2; 2
        a ^= 2;
        System.out.println(" ^= Operator : a ^= 2 is : " + a); // Bitwise XOR assignment operator a=a^2 =0
    }
}
