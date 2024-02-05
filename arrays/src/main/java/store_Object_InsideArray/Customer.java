package store_Object_InsideArray;

public class Customer
{
    public static <Newlaptop> void main(String[] args) {
        //CREATE OBJECT WITH DATA
        Laptop l1=new Laptop("HP",2000,"4GB");
        Laptop l2=new Laptop("lenvo",2000,"4GB");
        Laptop l3=new Laptop("dell",2000,"4GB");
        Laptop l4=new Laptop("apple",2000,"4GB");

        //CREATE ARRAY AND STORE VALUE OLD WAY
        Laptop [] l =new Laptop[4];
        //print length of array
        System.out.println("lenth of array :"+l.length);//4
        //now store value in array
        l[0]=l1;
        l[1]=l2;
        l[2]=l3;
        l[3]=l4;
        //now print the value using for loop
        for(int i=0;i<l.length;i++)
        {
            System.out.println(l[i]);//output
                                    //            Brand :HP Cost :2000 RamSize :4GB
                                    //            Brand :HP Cost :2000 RamSize :4GB
                                    //            Brand :HP Cost :2000 RamSize :4GB
                                    //            Brand :HP Cost :2000 RamSize :4GB

        }

        System.out.println("----------------------------------------------------------------------");
        //CREATE ARRAY AND STORE VALUE in less code
        Laptop laptop1= new Laptop("acer",5000,"4gb");
        Laptop laptop2= new Laptop("lenvo",50000,"gb");
        Laptop laptop3= new Laptop("dell",40000,"4gb");
        Laptop laptop4= new Laptop("samsung",40000,"7gb");

        //create array and store value inside laptop array
        Laptop [] newLaptops={laptop1,laptop2,laptop3,laptop4};
        //now print data from array using for each loop
        for(Laptop n:newLaptops)
        {
            System.out.println(n);

        }
    }
}
