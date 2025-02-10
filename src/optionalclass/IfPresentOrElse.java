package optionalclass;

import java.util.Optional;

public class IfPresentOrElse {
    public static void main(String[] args) {
        //ifPresent()
        Optional<String> container=getname();
        container.ifPresent((val) ->
                //logic
                System.out.println(val.toUpperCase())
        );
        //ifPresentOrElse
        container.ifPresentOrElse(
                //when value is presented
                (val) -> {
                    System.out.println("value is presented and i am in ifpresenorelse method");
                    System.out.println(val.toUpperCase());
                },//when value is not presented
                () -> System.out.println("value is not presented")
        );

    }

    public static Optional<String> getname() {
        //to return a value
        //keep the actural obj inside an optional obj,also known as container obj
        String meme = "vanakkam";
        Optional<String> name = null;
        if (meme == null) {
            name = Optional.empty();
        } else {
            name = Optional.of(meme);
        }
        return name;
    }
}