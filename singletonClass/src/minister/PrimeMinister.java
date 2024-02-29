package minister;

public class PrimeMinister {
    String name="modi";

    private static PrimeMinister pm;//pm=null

    private PrimeMinister(){
        System.out.println("PM got elected");
    }

    public static PrimeMinister createAndReturnPMObject(){
        if (pm==null){
            pm=new PrimeMinister();
        }
        return pm;
    }
}
