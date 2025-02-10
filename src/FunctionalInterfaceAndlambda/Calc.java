package FunctionalInterfaceAndlambda;

public class Calc implements Functional1,Functional2{


    @Override
    public void print() {
        System.out.println("i am actually at the calc operation");
    }

    @Override
    public int fun(int a, int b) {
        return 0;
    }

    public static void main(String[] args) {
        Functional1 fun=(()-> System.out.println("hi all"));
        fun.print();
        Functional2 add=((int a,int b)-> {
            return a+b;}
        );
        System.out.println(add.fun(2,3));
        Functional2 sub=((a,b)->{return a-b;});
        Functional2 mul=((a,b)->{return a*b;});
        int result= sub.fun(3,1);
        System.out.println(result);
        result= mul.fun(3,1);
        System.out.println(result);
    }
}
