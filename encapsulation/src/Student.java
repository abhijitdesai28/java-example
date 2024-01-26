public class Student
{
    private int age;

    public void setAge(int age)
    {
        if(age>17)
        {
            this.age=age;
        }
        else {
            System.out.println("u are not 18,wait for few years!");
        }
    }

    public int getAge()
    {
        return age;
    }


}
