
import java.util.*;

public class Reverse{

public static int[]  Array(int[] arr,int n)
{
    int r=arr.length-1;
    for(int i=r;i<arr.length;i--)
    {

    }
    
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
    arr=Array(arr,n);

    System.out.print(Arrays.toString(arr));
}
}