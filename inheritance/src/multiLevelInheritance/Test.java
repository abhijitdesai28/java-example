package multiLevelInheritance;

public class Test
{
    public static void main(String[] args) {
        //object creation
        Department d= new Department();
        System.out.println(d.departmentName);
        d.fest();
        System.out.println("-----------------------------");
        System.out.println(d.collegeName);
        d.providePlacements();
        System.out.println("-----------------------------");
        System.out.println(d.universityName);
        d.conductExams();

    }
}
