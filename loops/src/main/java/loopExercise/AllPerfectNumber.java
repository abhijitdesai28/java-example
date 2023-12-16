package loopExercise;

public class AllPerfectNumber
{
    //write a pgm to check all perfect numbers from 1 to 10000


        static boolean Perfect_Number(int num)
        {
            int sum = 0;
            for(int i=1; i<num; i++)
            {
                if(num%i==0)
                {
                    sum = sum+i;
                }
            }
            if(sum==num)
                return true;
            else
                return false;
        }
        public static void main(String args[])
        {
            for(int i=1; i<=10000; i++)
            {
                if(Perfect_Number(i))
                    System.out.println(i);
            }
        }
    }

