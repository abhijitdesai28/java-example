package premitiveTypecasting;

public class TypeCastingDemo
{
   public static void main(String[] args)
        {
            System.out.println("Widening");
            byte b=10;

            short s=b;
            System.out.println(b +" "+s);

            int i = s;
            System.out.println(s +" "+i);

            long l =i;
            System.out.println(i +" "+l);

            float f=l;
            System.out.println(l +" "+f);

            double d =f;
            System.out.println(f +" "+d);

            System.out.println("---------------------------");
            System.out.println("Narrowing");

            double d1=69;
            float f1=(float)d1;
            System.out.println(f1);

            long l1=(long)f1;
            System.out.println(l1);

            int i1=(int)l1;
            System.out.println(i1);

            short s1=(short)i1;
            System.out.println(s1);

            byte b1=(byte)s1;
            System.out.println(b1);

            char c=(char)b1;
            System.out.println(c);

            System.out.println("-----------------------------");
        }
    }

