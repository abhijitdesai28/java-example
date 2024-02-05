package store_Object_InsideArray;

public class Student
{
    String name;// non static global variable /member variable
    int id;//non static global variable /member variable

    //create constructor
    public Student(String name,int id)
    {
        this.name= name;
        this.id=id;
    }

    //override toString method or else u get string representation
    public String toString()
    {
        return "student name :"+name +" & id :"+id;
    }

    public static void main(String[] args) {
        //object creation
        Student s1= new Student("ramesh",100);
        Student s2= new Student("suresh",200);

        //create array which store two student data

        Student [] studentArray = new Student[2];

        //print student array length
        System.out.println("length of student array "+ studentArray.length);//length of student array 2

        //now store value inside array
        studentArray[0]=s1;
        studentArray[1]=s2;

        //now fetch value from array using--- for loop
        for(int i=0;i<studentArray.length;i++)
        {
            System.out.println(studentArray[i]);//student name :ramesh & id :100
                                                //student name :suresh & id :200
        }

    }
}
