package PreDefinedFunctionalInterface;

import java.util.function.Function;

public class Class1 {
    public static void main(String[] args) {
        Function<String,String> toUppercase=(s) ->s.toUpperCase();
//        String result=toUppercase.apply("helloall");
//        System.out.println(result);
       Function<String,String> Nullcheck=s -> s==null?"enter valid input":s;
       //and then sequence of execution
//        System.out.println(toUppercase.andThen(Nullcheck).apply(null));
        //null pointer exception
        //compose is an opposite of and then
        System.out.println(toUppercase.compose(Nullcheck).apply(null));


        //static method//accessed via interface name only
        //identity<T,T> both the input and the output type should be same
        Function<Integer,Integer> return1= Function.identity();
        System.out.println(return1.apply(132));

    }
}
