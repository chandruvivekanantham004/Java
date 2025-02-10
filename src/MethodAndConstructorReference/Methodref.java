package MethodAndConstructorReference;

public class Methodref {
    public static void main(String[] args) {
        //by lambda
        ConvertIntoUppercase convert = (s) -> {
            System.out.println("i am lambda");
            return s.toUpperCase() ;
        };
        System.out.println(convert.convert("i am in small case"));
        //by method reference
        ConvertIntoUppercase convert1= String::toUpperCase;
        System.out.println(convert1.convert("helloall"));
    }
}
