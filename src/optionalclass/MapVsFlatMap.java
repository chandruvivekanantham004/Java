package optionalclass;

import java.util.Optional;

public class MapVsFlatMap {
    public static void main(String[] args) {
        Optional<String> container=Optional.of("maxwell");
        //uppercase using MAP method
       String result= container.map((val)->val.toUpperCase()).get();
        System.out.println(result);
//extracting nested optional using MAP method
        Optional<Optional<String>> nestedContainer=Optional.of(Optional.of("akash"));
        Optional<String> nested=nestedContainer.map((val)->val.get());
        String output=nested.map((val)->val.toUpperCase()).get();
        System.out.println(output);
        //flatmap is going to flatening the optional object
        output=nestedContainer.flatMap(val->val).get().toUpperCase();
                                      //you are extracting the value
        System.out.println(output);
    }
}
