package staticKeyword;

import staticKeyword.Employee;

public class Test
{
    public static void main(String[] args) {
        //to access another class static variable we need to use class name
        System.out.println(Employee.id);//45
        System.out.println(Employee.name);//xyz

        //System.out.println(id); we cant access static variable of one class into another class directly ,we must use classname as ref

    }
}
