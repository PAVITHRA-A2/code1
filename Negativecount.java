
import java.util.Scanner;

class Form{

public int call(int num, int[] arr)
{
    int count=0;
   for(int i =0;i<num;i++)
   {
    if(arr[i]<0)
    {
     count++;
    }
   }
   return count;
}


}






public class Negativecount
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++)
         {
            arr[i]= sc.nextInt();
        }

        Form f = new Form();
       System.out.print(f.call(num, arr));
       // System.out.print(f.call(num, arr));
    }
}