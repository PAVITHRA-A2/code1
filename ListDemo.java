
import java.util.*;

public class ListDemo
{
    public static void main(String[] args)
    {
        List<Integer> value = new ArrayList<>();
        value.add(10);
        value.add(1);
        Collections.sort(value);
        System.out.println(value);

    }
}
