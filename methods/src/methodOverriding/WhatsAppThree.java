package methodOverriding;

public class WhatsAppThree extends WhatsAppTwo
{
    @Override
    void display()
    {
        super.display();
        System.out.println("blue ticks support");
    }

    @Override
    void call()
    {
        super.call();
        System.out.println("video call support");
    }

    void story()
    {
        System.out.println("you can add image only");
    }


}
