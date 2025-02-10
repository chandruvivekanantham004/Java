package PreDefinedFunctionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class consumer {
    public static void main(String[] args) {
        List<String> val = List.of("abc","def","ghi","jkl");
        Consumer<String> toupper =s-> System.out.println(s.toUpperCase());
        toupper.accept("chandru");
        val.forEach(toupper);
        List<String> values = new ArrayList<>();
        Consumer<String> addval = s->values.add(s.toUpperCase());//s is the string i want to store all the string which i'm passing
        val.forEach(addval);
        System.out.println(values);
        //another default method inside consumer is andthen()


    }
}
