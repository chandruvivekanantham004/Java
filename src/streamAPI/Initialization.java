package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Initialization {
    public static void main(String[] args) {
        //with collection obj
        List<String> list=List.of("one");
        Stream<String> stream1=list.stream();

        //with array value
        String[] name={"one","two"};
        Stream<String> stream2= Arrays.stream(name);

        //stream obj
        Stream<String> stream3= Stream.of("one");

        //generate method
        Stream<String> stream4=Stream.generate(()->"one");

        //builder()
        //Builder design pattern
        Stream.Builder<String> builder=Stream.builder();
        Stream<String> stream5= builder.add("one").add("two").build();//build method used to stop further adding of elements

        //empty()
        Stream<String> stream6= Stream.empty();

    }
}
