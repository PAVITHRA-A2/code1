@java.lang.FunctionalInterface
 interface  AA
 {
    public int show(int i , int j);
 }
public class FunctionalInterface
{
    public static void main(String[] args) 
    {
        //Lamdba Expression 
       AA a = (i,j)-> i+j;
        int res = a.show(5,5);
        System.out.println(res);
    }
}