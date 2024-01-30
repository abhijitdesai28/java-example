package nonPremitiveTypeCasting;

public class Test
{
    public static void main(String[] args) {
        //upcasting
        Father f=new Son();//superClassName refName = new childClassName();
        System.out.println("f.age ="+f.age);//40
        //  System.out.println(f.name);//it will give error ,in upcasting we cant access child class property

        System.out.println("---------------------------------------------------------");

        //DawnCasting
        Son s= (Son) f;//childClassName refName= (childClassName) refNameOfFather;
        System.out.println("s.age ="+s.age);//40
        System.out.println("s.name ="+s.name);//abhi
    }
}
