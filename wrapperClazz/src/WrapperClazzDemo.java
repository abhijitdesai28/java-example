public class WrapperClazzDemo
{
    public static void main(String[] args)
    {
        //primitive data types
        int intNO=10;
        float floatNo=10.5f;
        double doubleNo=10.55555448885;
        char character='a';
        byte aByte='a';
        boolean flag=false;
        long longID=87481258963L;
        short shortNo=254;

        //non-primitive (wrapper) data types
        //autoboxing
        Integer integerWrapperNo = intNO;
        Float floatWrapperNo=floatNo;
        Double doubleWrapperNo=doubleNo;
        Character characterWrapper=character;
        Byte wrapperByte=aByte;
        Boolean wrapperFlag=flag;
        Long longWrapperID=longID;
        Short shortWrapper=shortNo;

        System.out.println("\nInteger integerWrapperNo :"+integerWrapperNo +
                "\nFloat floatWrapperNo" +floatWrapperNo +
                "\nDouble doubleWrapperNo "+doubleWrapperNo+
                "\nCharacter characterWrapper "+characterWrapper+
                "\nByte wrapperByte "+wrapperByte+
                "\nBoolean wrapperFlag "+wrapperFlag+
                "\nLong longWrapperID "+longWrapperID+
                "\nShort shortWrapper "+shortWrapper);

        System.out.println("-------------------------------------------------------------");
        //unboxing
        int primitiveNo =integerWrapperNo;
        System.out.println("\nint primitiveNo :"+primitiveNo);

    }
}