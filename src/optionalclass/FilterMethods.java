package optionalclass;

import java.util.Optional;

public class FilterMethods {
    public static void main(String[] args) {
        Optional<String> container=getname();
        Optional<String> verifiedcontainer=container.filter(
                (str)->str.equalsIgnoreCase("maxwell")
                ).or(()->
        {
            return Optional.of("I AM THE or method ");
        });
        System.out.println(verifiedcontainer.get());

    }
    public static Optional<String> getname(){
        String str="maxwell";
        Optional<String> name=null;
        if(str==null){
            name=Optional.empty();
        }else{
        name=Optional.of(str);
        }
        return name;
    }
}
