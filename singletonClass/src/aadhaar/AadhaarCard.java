package aadhaar;

public class AadhaarCard {

    private static AadhaarCard ac;

    //create private constructor
    private AadhaarCard(){
        System.out.println("Aadhaar card object Created");
    }

    //create helper method
    public static void createAadharCardObject(){
        if (ac==null){
            ac=new AadhaarCard();
        }
    }
}
