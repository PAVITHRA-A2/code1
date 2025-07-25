
import java.util.Scanner;
class BinarySearchProcess
{
   public int BinarySearchFun(int[] a, int n , int d)
   {
    int left = 0;
    int right = n-1;
    while(left<=right)
    {
     int mid = (left+right)/2;
     if(d == a[mid])
     {
        return mid;
     }
     else if(d <a[mid])
     {
        right = mid-1;
     }
     else
     {
        left = mid+1;
     }

    }
    return -1;

   }
}





public class BinarySearch
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the N number");
      int n = sc.nextInt();
      int[] a = new int[n];
      for(int i =0;i<n;i++)
      {
        a[i] = sc.nextInt();
      }
      System.out.println("Enter the Data");
      int  d = sc.nextInt(); 
      BinarySearchProcess  bsp = new BinarySearchProcess();
      int result =bsp.BinarySearchFun(a, n, d);
      if(result!=-1)
      {
        System.out.println("Find the data Index:"+result);
      }
      else
      {
        System.out.println("Not Found in the Array ");
      }
    }
}