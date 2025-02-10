package PreDefinedFunctionalInterface;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.function.Supplier;

public class supplier {
    public static void main(String[] args) {
        //it only has abstract method only
        //it does not had any input
        Supplier<LocalDate> date = () ->LocalDate.now();
        System.out.println(date.get());
        currentdate(date);
    }
    //you can actually pass supplier as argument
    static void currentdate(Supplier<LocalDate> D){
        System.out.println(D.get());
    }
}
