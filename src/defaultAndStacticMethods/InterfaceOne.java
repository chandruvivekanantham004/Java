package defaultAndStacticMethods;

public interface InterfaceOne {
    void printname();
    default void printname1(){
        System.out.println("I am in default method 1");
    }
    default String printname2(){
        System.out.println("I am in default method 2");
        return"printname2 method";
    }
    static void print1(){
        System.out.println("i am in print1 of interface1");
    }
}
