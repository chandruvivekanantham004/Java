package defaultAndStacticMethods;

public interface InterfaceTwo {
    abstract String method();
    default void printname4(){
        System.out.println("I am interfacetwo print name function");
    }
    default String printname2(){
        System.out.println("i am an duplicate function of interfaceone in two");
        return"i am interface2 default method called printname2";
    }
}
