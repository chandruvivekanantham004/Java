package streamAPI;

import java.util.*;


public class Employee  {
    private int id;
    private String name;
    private String city;
    private int yearOfJoining;
    private double salary;
    private String department;
    private String gender;
    private int age;

public Employee(int id,String name,String city,int yearOfJoining,double salary,String department,String gender,int age){
    this.id=id;
    this.name=name;
    this.city=city;
    this.yearOfJoining=yearOfJoining;
    this.salary=salary;
    this.department=department;
    this.gender=gender;
    this.age=age;
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

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
