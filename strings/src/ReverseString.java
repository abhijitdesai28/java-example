public class ReverseString {
    public static void main(String[] args){

        // java ---->avaj
        //Approach one
        String s="java";
        StringBuffer sb=new StringBuffer(s);
        System.out.println(sb.reverse());//avaj

        System.out.println("------------------------------");

        //Approach two
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        System.out.println(rev);
    }
}
