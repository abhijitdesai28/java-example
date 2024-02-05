package store_Object_InsideArray;
/*
* this is the example of without overriding tostring method
* */
public class Person
{
    String name;// non static global variable /member variable
    int id;//non static global variable /member variable

    //create constructor
    public Person(String name, int id)
    {
        this.name= name;
        this.id=id;
    }

    public static void main(String[] args) {
        //object creation
        Person s1= new Person("ramesh",100);
        Person s2= new Person("suresh",200);

        //create array which store two student data

        Person[] personArray = new Person[2];

        //print student array length
        System.out.println("length of student array "+ personArray.length);//length of student array 2

        //now store value inside array
        personArray[0]=s1;
        personArray[1]=s2;

        //now fetch value from array using--- for loop
        for(int i=0;i<personArray.length;i++)
        {
            System.out.println(personArray[i]);//store_Object_InsideArray.Person@e9e54c2
                                                //store_Object_InsideArray.Person@65ab7765

            System.out.println(personArray[i].id +" & " +personArray[i].name);//100 & ramesh
                                                                                //200 & suresh
        }

    }
}
