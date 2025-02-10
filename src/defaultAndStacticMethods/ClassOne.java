package defaultAndStacticMethods;

public class ClassOne implements InterfaceOne, InterfaceTwo {
    @Override
    public void printname() {
        System.out.println("I am abstract method at interface1");
    }

    @Override
    public String method() {
        //we able to implement the default method form our implemeted abstract method
        printname();
        return "hello all I'm in classone and i am form interfacetwo";
    }
    @Override
    public String printname2(){//this could be possible if the method name have the same return type or signature
        InterfaceOne.super.printname2();
        return "i am 1st interface";
    }

    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        one.printname();
        one.printname1();
        System.out.println(one.printname2());

        one.printname4();
        System.out.println(one.method());
    }
}
