import java.util.*;


class Solution {
    public  int[] rotate(int[] nums, int k) {
    int n = nums.length;
    k=k%n;
    reverse(nums,0,n-1);
    reverse(nums,0,k-1);
    reverse(nums,k,n-1);
    return nums;
    }

    public void reverse(int[] nums,int start,int end)
    {
        while(start<=end)
        {
         int temp=nums[start];
         nums[start]=nums[end];
         nums[end]= temp;
         start++;
         end--;
        }
    }
}
public class Rotate{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraynum= sc.nextInt();
         int[] nums = new int[arraynum];
         for(int i=0;i<arraynum;i++)
         {
            nums[i]=sc.nextInt();
         }
         int k = sc.nextInt();
        Solution s = new Solution();
        nums = s.rotate(nums, k); 
        for (int num : nums) {
            System.out.print(num + " ");
        }
       

    }
}
