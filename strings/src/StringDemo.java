public class StringDemo
{
    public static void main(String[] args)
    {
        String sentence="this is my string.";

        System.out.println(sentence);//this is my string

        //isBlank demo
        String wordSets="word1 word2 word3";
        String blank="   ";
        System.out.println("isBlank (sentence) :"+sentence.isBlank());//false
        System.out.println("isBlank (wordSet) :"+wordSets.isBlank());//false
        System.out.println("isBlank (blank) :"+blank.isBlank());//true
        System.out.println("--------------------------------------------------------");

        //lines() demo
        sentence="this\nis\nmy\nstring";//sentence contain blank spaces
        System.out.println(sentence);
        //output
       //        this
       //        is
       //                my
      //        string

        System.out.println("--------------------------------------------------------");
        //repeat() demo
        String word="abhijit ";
        System.out.println("word.repeat(2)"+word.repeat(2));//abhijit abhijit
        System.out.println("word.repeat(3)"+word.repeat(3));//abhijit abhijit abhijit
        System.out.println("word.repeat(0)"+word.repeat(0));//0

        System.out.println("--------------------------------------------------------");

        //trim demo
        String spaceContainedString=" first-word second-word ";
        System.out.println("spaceContainString.trim() :"+spaceContainedString.trim());

        System.out.println("--------------------------------------------------------");
        //strip() demo
        System.out.println("spaceContainedString.strip() :"+spaceContainedString.strip());

        //strip() vs trim() demo
        var whitespacesString="\n\they buddy\u2005";
        System.out.println("whitespacesString.trim() :"+whitespacesString.trim());
        System.out.println("whitespacesString.strip() :"+whitespacesString.strip());
        System.out.println("trim() -eq strip() "+whitespacesString.trim().equals(whitespacesString.strip()));//false
        System.out.println("--------------------------------------------------------");

        //stripLeading()  and stripTrailing()
        var nextWhitespacesString ="n\t\u2005hey buddy\u2005";
        System.out.println("actual string with whitespaces :"+nextWhitespacesString);
        System.out.println("String after Striping leading whitespaces :"+nextWhitespacesString.stripLeading());
        System.out.println("String after striping trailing whitespaces:"+nextWhitespacesString.stripTrailing());
        System.out.println("--------------------------------------------------------");

        String blah="blah ";
        String blah1= new String("blah ");
        System.out.println("blah.equals(blah1)"+blah.equals(blah1));//true
        System.out.println("blah==blah1 :"+blah==blah1);//false
        System.out.println("--------------------------------------------------------");

        //length() method
        System.out.println(blah1.length());//5
        System.out.println("--------------------------------------------------------");

        //toUpperCase() method
        System.out.println(blah1.toUpperCase());
        System.out.println("--------------------------------------------------------");

        //toLowerCase
        System.out.println(blah.toLowerCase());
        System.out.println("--------------------------------------------------------");

        //getBytes()
        byte[] blahBytes = blah.getBytes();
        for(byte blahbyte :blahBytes)
        {
            System.out.println("blahBytes :"+blahbyte);
        }

        System.out.println("--------------------------------------------------------");

        //concat() method
        System.out.println("blah.concat(double blah) :"+blah.concat("*double blah*"));
        System.out.println("blah after concat: "+blah);

        System.out.println("--------------------------------------------------------");
        //replace() method

        System.out.println("blah.replace(\" \", \"##\"): "+blah.replace(" ","##"));
        System.out.println("--------------------------------------------------------");

        //subString() method
        System.out.println("blah.substring(2,5): "+blah.substring(2,5));
        System.out.println("blah.substring(2): "+blah.substring(2));
        System.out.println("--------------------------------------------------------");
    }
}