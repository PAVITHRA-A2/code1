/*import java.util.*;

public class Trans {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Matrix 1:");
        int row=sc.nextInt();
        int col= sc.nextInt();
        int[][] a = new int[row][col];
        int[][] b = new int[col][row];
        for (int i=0;i<a.length;i++) 
        {
            for (int j = 0; j < a[0].length; j++)
            {
                System.out.print("matric: "+ i+j+" ");
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                b[j][i] = a[i][j];
                
                
            }
        }
        for(int i=0; i<col;i++)
        {
            for(int j=0;j<row;j++)
            {
               System.out.print(b[j][i]+" ");
             
            }
            System.out.println();
        }
   }
}*/
class Solution {
    public int Trans(int[][] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums[i].length;j++)
            {
                for(int k=0;k<nums.length;k++)
                {
                    int m=nums[k][j];
                    int max=Integer.MIN_VALUE;
                    if(m>max)
                    {
                        max=m;
                    }
                }
                system.out.print(max);
            }

        }
    }
}

