import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex2 {
    public static void main(String[] args) {
        //String
        String arr[]={"abc@gmail.com","aaa","abcd","manana"};
        for (String res : arr){       //for-each loop
            if(res.matches("[a-z]+@gmail.com")==true)
            {
                System.out.println(res);
            }
        }
       // String str = "neer";
       // System.out.println(str.matches("[a-z]{4}");
    }
}
