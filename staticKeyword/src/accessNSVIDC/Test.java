package accessNSVIDC;

public class Test
{
    public static void main(String[] args) {
        //to access non-static variable we need create object of that class
        Employee e= new Employee();

        System.out.println("name :"+e.name);//abhijit
        System.out.println("age of employee :"+e.age);//25
        System.out.println("gender of employee :"+e.gender);//m
    }

}

/*
   OUTPUT:

        name :abhijit
        age of employee :25
        gender of employee :m

 */
