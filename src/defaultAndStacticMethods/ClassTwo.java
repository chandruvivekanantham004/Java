package defaultAndStacticMethods;

public class ClassTwo implements InterfaceOne, InterfaceTwo {
    @Override
    public void printname() {
        System.out.println("hello all");
    }

    @Override
    public String method() {//Static methods can be called using the abstract methods but it should be called via interfacename only;
        InterfaceOne.print1();
        return "!!!!!";
    }
    @Override
    public String printname2(){
        return "i am the one who is created at the classtwo";
    }

    public static void main(String[] args) {
        ClassTwo two= new ClassTwo();
        System.out.println(two.printname2());
        InterfaceOne.print1();//static methods can be called via the interface name only

    }
}
