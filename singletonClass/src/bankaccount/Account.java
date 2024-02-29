package bankaccount;

public class Account {
   private static Account obj;

    //create private constructor
    private Account(){
        System.out.println("object created successfully");
    }

    public static void createObject(){
        if (obj==null) {
            obj = new Account();
        }else{
            System.out.println("cannot create object");
        }
    }
}