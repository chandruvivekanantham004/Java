package optionalclass;

import java.util.Optional;

public class OptionalOrElseMethodsDemo {
    public static void main(String[] args) {
        //Or()
        //if value is Presented,returns same Optional object value
        //if value is not Presented
        //then the supplier functionality will produce optional with value (you are returning an optional obj)
        Optional<String> container = getname();
        String result=container.or(() ->{
                    return Optional.of("java Optional Or Method");
                }
                ).get();//here in Or method we have to use the get method to extract optional obj
        System.out.println(result);
        //OrElse()
        //if value is presented,returns the same optional obj
        //if value is not presented
        //else it should return the value
        result=container.orElse("this is orElse method which already had an return type as string for this optional obj");
        System.out.println(result);
        //orElseGet()
        //if value is not presented we should use supplier funtionality
        //its similar like orelse method but orElseGet method should be used in
        //situation where we have to perform some logical operation or different things for different methods
        result = container.orElseGet(
                () -> "I am in orElseGet() Method"
        );
        System.out.println(result);
        //orElseThrow()
        //this method should be used when you want to throw an exception
         //result=container.orElseThrow();
       // System.out.println(result);
        //orElseThrow() with supplier
        try {
            container.orElseThrow(() -> {
                return new Exception("THIS IS AN EXCEPTION CREATED BY ME");
            });
        } catch (Exception e) {
            e.printStackTrace();
        }



    }
    public static Optional<String> getname(){
        //to return a value
        //keep the actural obj inside an optional obj,also known as container obj
        String meme=null;
        Optional<String> name=null;
        if(meme==null){
            name=Optional.empty();
        }else{
            name=Optional.of(meme);
        }
        return  name;
    }
}
