package constructorChaining;

public class Son extends Father
{
    Son()
    {
        super(10);//explicitly (mean we need to call)
        //super();//implicitly (mean automatically call
        System.out.println("calling son class constructor 2");
    }
}
