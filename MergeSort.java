
import java.util.*;
class Allsorted
{
    public void  mergeSorted(int[] a,int lb,int ub)
    {
      if( lb<ub)
      {
       int mid = (lb+ub)/2;
      mergeSorted(a, lb, mid);
      mergeSorted(a, mid+1, ub);
      merge(a, lb, mid, ub);
      
      }
    }
    public void merge(int[] a,int lb, int mid ,int ub)
    {
        int i=lb;
        int j = mid+1;
        int k =lb;
        int[] b = new int[a.length];
        while(i<=mid && j<=ub) 
        {
            if(a[i]<=a[j])
            {
                b[k]=a[i];
                i++;
                k++;   
            }
            else
            {
              b[k]=a[j];
              j++;
              k++;
            }
        }
        if(i>mid)
        {
            while(j<=ub)
            {
                b[k]=a[j];
                j++;
                k++;
            }
        }
        else{
            while(i<=mid)
            {
                b[k]=a[i];
                i++;
                k++;
            }
        }
         System.out.print("Merged: ");
        for (int x = lb; x <= ub; x++) {
            a[x]=b[x];
            System.out.print(a[x] + " ");
        }
        System.out.println();
        
    }


}


public class MergeSort
{
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[]  a = new int[n];
      for(int i=0;i<a.length;i++)
      {
        a[i]=sc.nextInt();
      }
      Allsorted as = new Allsorted();
        as.mergeSorted(a, 0, n - 1);

       System.out.println("Sorted array:");
      for (int i = 0; i < a.length; i++) {
           System.out.print(a[i] + " ");
   //
    }
    }
}


