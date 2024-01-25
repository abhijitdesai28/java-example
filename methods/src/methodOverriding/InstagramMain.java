package methodOverriding;

public class InstagramMain
{
    public static void main(String[] args) {
        System.out.println("----------main method start---------");
        //create object
        InstagramThree instagramThree = new InstagramThree();
        instagramThree.upload();
        System.out.println("------------------------------------------");
        instagramThree.directMessage();
        System.out.println("------------------------------------------");
        instagramThree.story();
        System.out.println("----------main method End---------");
    }
}
