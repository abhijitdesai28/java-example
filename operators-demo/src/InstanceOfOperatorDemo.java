public class InstanceOfOperatorDemo
{
//    Pseudo Code:
//    program to shift bit by 2 to right

    public static void main(String[] args)
    {
        String city="Pune";
        Integer length=23;
        Double temperature=36.5;

        if(city instanceof String)
        {
            System.out.println("type of city is string");
        }
        else {
            System.out.println("type of city is not string");
        }

        if(length instanceof Integer)
        {
            System.out.println("type of length is integer");
        }
        else {
            System.out.println("type of length is not integer");
        }

        if(temperature instanceof Double)
        {
            System.out.println("type of temperature is Double");
        }
        else {
            System.out.println("type of temperature is not Double");
        }
    }
}
