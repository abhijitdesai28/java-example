package classCastException;

public class Solution
{
    public static void main(String[] args) {
        Father f= new Daughter();

        if(f instanceof Son)//false
        {
            System.out.println("Downcasting to son");
            Son s= (Son)f;
            System.out.println(s.x +" "+ s.y);
        } else if (f instanceof Daughter)//true
        {
            System.out.println("downcasting to daughter");
            Daughter d=(Daughter) f;
            System.out.println(d.x +" "+ d.z);

        }
    }
}
