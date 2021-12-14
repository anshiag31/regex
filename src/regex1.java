import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class regex1{
    public static void main(String[]args){
        String target="2Bf5BBg7BBBi%";
        //String target="jdbc regular9876 expression6543 jdbc is 2345 important";
        Pattern p=Pattern.compile("[B]?");
        Matcher m=p.matcher(target);
        int ctr=0;
        while(m.find()){
            ctr++;
            System.out.println(m.start()+"--"+m.end()+"--"+m.group());
        }
        System.out.println(ctr);

    }
}
