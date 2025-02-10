package PreDefinedFunctionalInterface;

public class Employee {
    private int id;
    private String name;
    private int salary;
    private String address;
    private String gender;
    Employee(int id,int salary,String s){
        this.id=id;
        this.salary=salary;
        this.gender=s;
    }
    Employee(){

    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public boolean equals(Object obj) {
        Employee emp=(Employee) obj;
        return this.getId()== emp.getId();
    }
}
