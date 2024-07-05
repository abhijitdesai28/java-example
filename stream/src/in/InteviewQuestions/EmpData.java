package in.InteviewQuestions;

import java.util.*;
import java.util.stream.Collectors;

public class EmpData {
    public static void main(String[] args) {
        List<Employee> employeeList= new ArrayList<Employee>();

        employeeList.add(new Employee(1,"jhansi",32,"Female","HR",2011,25000.0));
        employeeList.add(new Employee(2,"Smith",25,"Male","Sales",2015,13500.0));
        employeeList.add(new Employee(3,"David",29,"Male","Infrastructure",2012,18000.0));
        employeeList.add(new Employee(4,"Orlen",28,"Male","Development",2014,32500.0));
        employeeList.add(new Employee(5,"Charlee",27,"Male","HR",2013,22700.0));
        employeeList.add(new Employee(6,"Cathy",43,"Male","Security",2016,10500.0));
        employeeList.add(new Employee(7,"Ramesh",35,"Male","Finance",2010,27000.0));
        employeeList.add(new Employee(8,"Suresh",31,"Male","Development",2015,34500.0));
        employeeList.add(new Employee(9,"Gita",24,"Female","Sales",2016,11500.0));
        employeeList.add(new Employee(10,"Mahesh",38,"Male","Security",2015,11000.0));
        employeeList.add(new Employee(11,"Gouri",27,"Female","Infrastructure",2014,15700.0));
        employeeList.add(new Employee(12,"Nithin",25,"Male","Development",2016,28200.0));
        employeeList.add(new Employee(13,"Swathi",27,"Female","Finance",2013,21300.0));
        employeeList.add(new Employee(14,"Buttler",24,"Male","Sales",2017,10700.0));
        employeeList.add(new Employee(15,"Ashok",23,"Male","Infrastructure",2018,12700.0));
        employeeList.add(new Employee(16,"Sanvi",26,"Female","Development",2015,28900.0));

        //How many male and female employee are there in th organization?
        Map<String, Long> map1 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(map1);//{Male=11, Female=5}

        //print the name of all departments int organization?
        employeeList.stream()
                                 .map(e->e.department)
                                     .distinct()
                                        .forEach(name ->System.out.println(name));

        //What is the average age of male and female employee?
        Map<String, Double> map2 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println(map2);//{Male=29.818181818181817, Female=27.2}

        //Get the details of highest paid employee in the organization?
        Optional<Employee> optional = employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
        //System.out.println(optional.get().salary);//34500.0
        if(optional.isPresent()){
            Employee employee=optional.get();
            System.out.println(employee);
        }

        //Get the names of all employees who have joined after 2015?
        employeeList.stream().filter(y->y.yearOfJoining>2015).map(e->e.name).forEach(name-> System.out.println(name));

        //Count the number of employee in each department?
        Map<String, Long> empCnt = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println(empCnt);//{Sales=3, Finance=2, Development=4, Infrastructure=3, HR=2, Security=2}

        //What is the average salary of each department?
        Map<String, Double> collect = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect);

        //Get the details of youngest male employee in the Development department?
        Optional<Employee> minAge = employeeList.stream().filter(e -> e.getGender().equals("Male") && e.getDepartment().equals("Development"))
                .min(Comparator.comparing(Employee::getAge));
       // System.out.println(minAge);

        if(minAge.isPresent()){
            System.out.println(minAge.get());
        }

        //Who has the most working experience in the organization?
        Optional<Employee> collect1 = employeeList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoining)));
        if(collect1.isPresent()){
            System.out.println(collect1.get());
        }

        //How many male and female employees are there in the sales team?
        Map<String, Long> salescnt = employeeList.stream().filter(e -> e.getDepartment().equals("Sales"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println(salescnt);

        //What is the average salary of male and female employee?
        Map<String, Double> collect2 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(collect2);//{Male=20118.18181818182, Female=20480.0}

        //List down the names of all employees in each department?
        Map<String, List<Employee>> collect3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
        System.out.println(collect3);

        //What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics collect4 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println(collect4.getAverage());//20231.25
        System.out.println(collect4.getSum());//323700.0
    }
}

class Employee {
    int id;
    String name;
    int age;
    String gender;
    String department;
    int yearOfJoining;
    double salary;

    Employee(int id,String name,int age,String gender,String department,int yearOfJoining,double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                '}';
    }
}
