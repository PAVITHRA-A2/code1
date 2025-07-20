import java.util.*;

public class MapDemo
{
    public static void main(String[] args) 
    {
       Map<String,Integer> map= new Hashtable<>();

       map.put("Tamil",90);
       map.put("English",99);
       map.put("Maths",100);
       map.put("Science",100);
       map.put("Social",95);

System.out.print(map);
    }
}
