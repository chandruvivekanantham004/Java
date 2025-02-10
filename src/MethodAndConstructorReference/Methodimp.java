package MethodAndConstructorReference;

import java.util.Arrays;

public class Methodimp {
    public static void main(String[] args) {
        //by using lambda
//        EmpValid tochecek=(e) ->e.Validemp(e);
//        Employee ide=new Employee();
//        boolean r=tochecek.Validemp(ide);
//        System.out.println(r);
        //by using method reference
//        EmpValid check=Employee::Validemp;
//        System.out.println(check.Validemp(ide));
        //for instance method
//        Employee emp=new Employee();
//        EmpValid check1=(e) ->e.Validemp(e);//by using lambda
//        EmpValid check2=emp::Validemp;//we are able to access it via the class name if it does not hava any arguments
//        System.out.println(check2.Validemp(emp));
//        //example for accessing instance ref via class name if it does not have arguments
//        SalaryValid salary=Employee::validsalary;//create an instance inside salaryvalid by gpt@@
//        System.out.println(salary.validsalary(emp));
        //array  of string values
        String[] val={"java","aroma","maxwell","box","xmas"};
        //references to instance method of arbitary obj of given type(for this string)
        Arrays.parallelSort(val,0,4,String::compareToIgnoreCase);
        for(String str:val){
            System.out.println(str);
        }
    }
}
