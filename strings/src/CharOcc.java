public class CharOcc {
    public static void main(String[] args){
        //Approach one
        String s="mumbai";
        int count=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='m'){
                count++;
            }
        }
        System.out.println(count);

        System.out.println("---------------------------------------");
        //Approach two
        String s1="java";
        char ch[]=s1.toCharArray();
        int cnt=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a'){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
