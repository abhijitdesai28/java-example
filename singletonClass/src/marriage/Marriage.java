package marriage;

public class Marriage {
    int age=29;

    private static Marriage m;

    private Marriage(){
        System.out.println("got married");
    }

    public static Marriage createObject(){
        if(m==null){
            m=new Marriage();
        }
        return m;
    }
}
