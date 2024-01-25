package methodOverriding;

public class InstagramTwo extends InstagramOne
{
    @Override void upload()
    {
        super.upload();
        System.out.println("u can add 'GIF'");
    }

    void directMessage()
    {
        System.out.println("u can text person");
    }
}
