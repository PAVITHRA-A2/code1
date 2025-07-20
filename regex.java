
import java.util.regex.*;
import java.util.*;
class Form
{
     
    public int call(String input)
    {
       
        Pattern p = Pattern.compile("[^a-zA-Z0-9\\s]");
        Matcher m = p.matcher(input);
        int cou=0;
       while(m.find())
       {
        cou++;
       }
        return cou;
      
    }
    
}



public class regex
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Form f = new Form();
        int result = f.call(input);
        System.out.println(result);
      
    }
}

