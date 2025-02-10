package MethodAndConstructorReference;

public class Employee {
    private int id;
    private String name;
    private String address;
    private int salary;
    void showEmployee(){
        System.out.println("i am an empty consturctor");
    }
    Employee (int i,String an){
        this.id=i;
        this.name=an;
    }
     boolean Validemp(Employee e){
        if(e.getId() !=0 && e.getName()!=null)return true;
    return false;
    }
    boolean validsalary() {
        return this.getSalary() != 0 ? true : false;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
