package optionalclass;

import java.util.Optional;

public class UpperCase {
    public static void main(String[] args) {
//        String str=getname();
//        if(str!=null)
//           str= str.toUpperCase();
//        System.out.println(str);
        Optional<String> str = getname();
        if(str.isPresent()) {
            String naam= str.get();
            naam=naam.toUpperCase();
            System.out.println(naam);
        }else{
            System.out.println("container does not contain anything");
        }
        if(str.isEmpty()){
            System.out.println("i am isEmpty");
        }else {
            System.out.println(str.get().toUpperCase());
        }


    }
//    public static String getname(){
//        String name="hello all";
//        return name;
//    }
    public static Optional<String> getname(){
        //to return a value
        //keep the actural obj inside an optional obj,also known as container obj
        String meme="vanakkam";
        Optional<String> name=null;
        if(meme==null){
            name=Optional.empty();
        }else{
            name=Optional.of(meme);
        }
        return  name;
    }
}
