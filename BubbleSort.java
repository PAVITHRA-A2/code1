import java.util.*;

class Numsorting
{
    public static void sorting(int n, int[] arr)
    {
       for(int i=0;i<n-1;i++) 
       {
        for(int j=0;j<n-1-i;j++)
        {
            if(arr[j]>arr[j+1])
            {
                int temp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
       }
    }


    public void printValues(int[] arr)
    {
        for(int vals: arr)
        {
            System.out.print(vals+" ");
        }
    }
}

public class BubbleSort
{
    public static void main(String args[])
    {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] arr = new int[n];
     for(int i =0;i<arr.length;i++)
     {
        arr[i]=sc.nextInt();
     }
     Numsorting ns = new Numsorting();
    
      Numsorting.sorting(n, arr);           
        System.out.print("Sorted elements:");
        ns.printValues(arr); 

    }
}

