package streamAPI;


import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperation {
    public static void main(String[] args) {
        List<Employee> employees=employeeList();
        //stream methods /operation
        //requirement:Get all employee names as list
        List<String> empName=new ArrayList<>();
        for(Employee emp:employees){
            empName.add(emp.getName());
        }
        System.out.println(empName);

        //by using streams
        List<String> empname=employees.stream().map(e->e.getName()).toList();
        System.out.println(empname);

        //req:employee name ,age>25
        List<String>name=employeeList().stream().filter(e->e.getAge()>25).map(e->e.getName()).toList();
        System.out.println(name);
        //req:print all city names of employees
        //distinct()
        //forEach()
          employeeList().stream()
                       .map(emp->emp.getCity())
                       .distinct()
                       .forEach(System.out::println);
          //get count of employees whose salary is >20k
        long count=employeeList().stream().filter(emp->emp.getSalary()>20000).count();
        System.out.println(count);

        //get first 3 employee details
        List<Employee> employee1=employeeList().stream().limit(3).toList();
        System.out.println(employee1);
        List<Employee> emp=employeeList();
        System.out.println(emp);
        //sort emp based on id
       List<Employee> idbase= employeeList().stream().sorted((emp1,emp2)->emp1.getId()-emp2.getId()).toList();
        System.out.println(idbase);
        //skip first 3 emp obj
        List<Employee> skipemp=employeeList().stream().skip(3).toList();
        System.out.println(skipemp);
        //anymatch()
        boolean result=employeeList().stream().anyMatch(e->e.getAge()<20);
        System.out.println(result);
        //allMatch
        result=employeeList().stream().allMatch(e->e.getAge()>20);
        System.out.println(result);
        //noneMatch()//none of them should match if any of them matches it will return false
        result=employeeList().stream().noneMatch(e->e.getSalary()<20000);
        System.out.println(result);
        //findAny() it will return any of the list of employee
        Employee findAnyMethod= employeeList().stream().findAny().get();
        System.out.println(findAnyMethod);
        //findFirst() it will return the first element which is present in the employee list
        Employee findFirstMethod= employeeList().stream().findFirst().get();
        System.out.println(findFirstMethod);
        //minimum salary emp details
        Employee minimum=employeeList().stream().min((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).get();
        System.out.println(minimum);
        //maximum salary emp details
        Employee maximum=employeeList().stream().max((e1,e2)->(int)(e1.getSalary()-e2.getSalary())).get();
        System.out.println(maximum);
        //average salary of employees
        double avg=employees.stream().mapToDouble(e->e.getSalary()).average().getAsDouble();
        System.out.println(avg);
        //average age of employees
        double avgage=employeeList().stream().mapToInt(empl->empl.getAge()).average().getAsDouble();
        System.out.println(avgage);
        //peek() method used to track which all are passed into next
        //used to track which all of them are passing to next stream operation
        System.out.println("***peek method***");
        List<Employee> peek=employeeList().stream().peek(System.out::println).filter(e->e.getSalary()>30000).toList();
        System.out.println(peek);
        //collect() method
        //collectors: JDK8 , as a part of stream API operation

        //collect all employee names as list using collect method
        List<String> collect=employeeList().stream().map(e->e.getName()).collect(Collectors.toList());
        System.out.println(collect);

        //unique department names
        //by using set
      Set<String> unique=  employeeList().stream().map(Employee::getDepartment).collect(Collectors.toSet());
        System.out.println(unique);
        //collect employee id and their salaries
       Map<Integer,Double> map= employeeList().stream().collect(Collectors.toMap(Employee::getId,Employee::getSalary));
        System.out.println(map);

        //groupingBy()
        //based on their gender and their salaries
        Map<String,Double> GEN=employeeList().stream().collect(Collectors.groupingBy(e->e.getGender(),Collectors.averagingDouble(Employee::getSalary)));
        System.out.println(GEN);
        //based on thier gender and their total salary
        Map<String,Double> basedongender=employeeList().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.summingDouble(e->e.getSalary())));
        System.out.println(basedongender);
        //count()
        //get count of employees gender wise
        Map<String,Long> countofemp=employeeList().stream().collect(Collectors.groupingBy(Employee::getGender,Collectors.counting()));
        System.out.println(countofemp);
        //summing
        //summarizing
       Double empsalary= employeeList().stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println(empsalary);
        System.out.println(employeeList().stream().collect(Collectors.summarizingDouble(Employee::getSalary)));

        //maxby() method
        Employee max=employeeList().stream().collect(Collectors.maxBy((e1,e2)->(int)(e1.getSalary()-e2.getSalary()))).get();
        System.out.println(max);

        //joining
        //all department names with delimiter:::
        String join=employeeList().stream().map(e->e.getDepartment()).collect(Collectors.joining(":::"));
        System.out.println(join);







    }




    public  static List<Employee> employeeList() {
        List<Employee> employeeList=new ArrayList<>();
        employeeList.add(new Employee(6,"six","hydrabad",2003,23000,"Hr","male",44));
        employeeList.add(new Employee(5,"five","telegana",2020,12000,"accounts","female",25));
        employeeList.add(new Employee(4,"four","hydrabad",2023,30000,"IT","male",23));
        employeeList.add(new Employee(3,"three","hydrabad",2017,3000,"infrastructure","male",33));
        employeeList.add(new Employee(1,"one","chennai",2019,43000,"finance","male",26));
        employeeList.add(new Employee(2,"two","hydrabad",2013,33000,"Hr","male",36));
        employeeList.add(new Employee(8,"eight","hydrabad",2023,23000,"it","female",22));
        employeeList.add(new Employee(7,"seven","hydrabad",2024,42000,"devops","male",25));
        return employeeList;
    }


}
