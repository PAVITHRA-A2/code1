import java.util.*;

class LinkList
{
    public int  display(int[] arr)
    { 
         Arrays.sort(arr);
         List<Integer> l= new ArrayList<>();
        int small_arr=arr[0];
       int large_arr=arr[arr.length-1];
       int sum=0;
       for(int i=small_arr;i<=large_arr;i++)
       {
             int current = i;
              while(current!=0)
              {
                int digit = current%10;
                sum = sum+digit;
                current=current/10;
              }  
              l.add(sum);
       }
    return sum;
      
    }
  
}


class Main {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc = new Scanner(System.in);
       List<Integer> l= new ArrayList<>();
       int n = sc.nextInt();
       int[] arr = new int[n];
       for(int i=0;i<arr.length;i++)
       {
        arr[i]=sc.nextInt();
       }
       LinkList solu = new LinkList();
       solu.display(arr);
    }
}