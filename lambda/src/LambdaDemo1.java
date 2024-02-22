
@FunctionalInterface
interface Message{
    public void text();
}

public class LambdaDemo1 {
    public static void main(String[] args) {
        System.out.println("Simple example of lambda expression");
        Message message=() ->System.out.println("im from pune");
        message.text();
    }
}