public class ImmutablePractical {
    public static void main(String[] args){
        //here we r looking string immutable concept

        String str1="pune"; //SCP
        String str2="mumbai";//SCP

        str1.concat(str2);
        System.out.println(str1);//pune

        /*
            in above code we r expecting two string is going to concat or add
            but this is not happen bcz of immutable concept not going to add
         */
    }
}
