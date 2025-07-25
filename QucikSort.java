
import java.util.Scanner;

class ProcessOfQucikSort
{
    public int partition(int[] a,int lb,int ub)
    {
        int key = a[lb];
        int start = lb;
        int end = ub;
        while(start < end)
        {
            while(start <= ub && a[start]<= key)
            {
                start++;
            }
            while(a[end]>key)
            {
                end--;
            }
            if(start<end )
            {
                int temp=a[start];
                a[start] = a[end];
                a[end]=temp;

            }
        }
        int temp2 = a[lb];
        a[lb]=a[end];
        a[end]=temp2;
        return end;
    }
    public void QuckicSortingPro(int[] a, int lb, int ub)
    {
        if(lb<ub)
        {
        int loc = partition(a, lb, ub);
        QuckicSortingPro(a, lb, loc-1);
        QuckicSortingPro(a, loc+1, ub);
        }
    }

}

public class QucikSort
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter n number: ");
       int n = sc.nextInt();
       int[] a = new int[n];
       System.out.println("Enter The array: ");
       for(int i=0;i<n;i++)
       {
        a[i]=sc.nextInt();
       } 
       ProcessOfQucikSort pqs = new ProcessOfQucikSort();
       
       pqs.QuckicSortingPro(a, 0, n-1);
       System.out.println("sorted:");
        for(int vals: a )
        {
            System.out.print(vals+" ");
        }
    }
}


