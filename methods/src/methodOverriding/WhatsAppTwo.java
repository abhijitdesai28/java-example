package methodOverriding;

public class WhatsAppTwo extends WhatsAppOne
{
    @Override
    void display()
    {
        super.display();
        System.out.println("Double ticks supported");
    }

    void call()
    {
        System.out.println("voice call supported");
    }
}
