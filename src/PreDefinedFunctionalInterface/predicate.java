package PreDefinedFunctionalInterface;

import java.util.function.Predicate;

public class predicate {
    public static void main(String[] args){
//        Predicate<Integer> agecheck=i -> i>22;
//        System.out.println(agecheck.test(23));
//        if(agecheck.test(27)){
//            System.out.println("your are eligible for voting");
//        }else{
//            System.out.println("you are not eligible");
//        }

        //find the employee salary is > than 20000 or not
        Predicate<Employee> salarycheck=e ->e.getSalary()>25000;
        Employee emp=new Employee(11,30000,"male");
        System.out.println(salarycheck.test(emp));
        //2 default methods of predicate is AND and OR and negate(returns opposite of what we get)
        Predicate <Employee> gendercheck=e ->e.getGender().equals("female");
        System.out.println(salarycheck.and(gendercheck).test(emp));//both should be true toget true
        System.out.println(salarycheck.or(gendercheck).test(emp));//either one should be true
        System.out.println(salarycheck.negate().test(emp));//it is true because of negate it returns false

        //static method-> isEqual()
        //employee have to validate other employee
        //you have to override the equals method
        Employee employee1 = new Employee();
        employee1.setId(11);
        Employee emp1=new Employee();
        emp1.setId(1);
        Predicate<Employee> empvalidatation=Predicate.isEqual(emp);
        System.out.println(empvalidatation.test(emp1));


    }
}
