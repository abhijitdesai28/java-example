package methodOverriding;

public class InstagramThree extends InstagramTwo
{
    @Override
    void upload()
    {
        super.upload();
        System.out.println("u can add video ");
    }

    void directMessage()
    {
        super.directMessage();
        System.out.println("u can send images");
    }

    void story()
    {
        System.out.println("u can add story");
    }

}
