
import java.util.*;

public class arraysum{

public static int  Array(int[] arr,int n)
{
    int sum =0;
    for(int i=0;i<n;i++)
    {
        sum+=arr[i];
    }
     return sum;
}


public  static void main(String args[])
{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
        arr[i]=sc.nextInt();
    }
    int result=Array(arr, n);

    System.out.print(result);
}
}