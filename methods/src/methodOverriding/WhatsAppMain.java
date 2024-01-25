package methodOverriding;

public class WhatsAppMain
{
    public static void main(String[] args) {
        System.out.println("----------main method start---------");
        //create object
        WhatsAppThree whatsAppThree= new WhatsAppThree();
        whatsAppThree.display();
        System.out.println("------------------------------------------");
        whatsAppThree.call();
        System.out.println("------------------------------------------");
        whatsAppThree.story();
        System.out.println("----------main method End---------");
    }
}
