package bankaccount;

public class TestAccount {
    public static void main(String[] args) {

        /*
           //here we don't want to create multiple object
           bankaccount.Account oj1 = new bankaccount.Account();
           bankaccount.Account oj2 = new bankaccount.Account();
           bankaccount.Account oj3 = new bankaccount.Account();
         */

        //call method of account class
        Account.createObject();//object created successfully
        Account.createObject();//cannot create object
        Account.createObject();//cannot create object
    }
}
