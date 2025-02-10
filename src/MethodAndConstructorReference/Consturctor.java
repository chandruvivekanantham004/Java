package MethodAndConstructorReference;

public class Consturctor {
    public static void main(String[] args) {
        //Employee e= new Employee() this is somewhat like that
        EmployeeInstance construct = Employee::new;
        Employee emp=construct.showDetail(44,"maxwell");//the return type is employee
        System.out.println(emp.getId());


    }
}
