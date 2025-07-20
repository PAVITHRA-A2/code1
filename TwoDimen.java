import java.util.*;
public class TwoDimen
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
     System.out.println("m1");
     int row1= sc.nextInt();
       System.out.println("m1");
     int col1 = sc.nextInt();
       System.out.println("m2");
     int row2 = sc.nextInt();
       System.out.println("m2");
     int col2 = sc.nextInt();

     if(row1==row2 && col1==col2)
     {
       int[][] a=new int[row1][col1];
       int[][] b= new int[row2][col2];
        int[][] c = new int[row1][col1];

       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.println("enter mat"+ i + j );
            a[i][j]=sc.nextInt();
        }
       }
       
       for(int i=0;i<b.length;i++)
       {
        for(int j=0;j<b[i].length;j++)
        {
            System.out.println("enter mat"+ i + j );
            b[i][j]=sc.nextInt();
        }
        }
       
       for(int i=0;i<b.length;i++)
       {
        for(int j=0;j<b[i].length;j++)
        {
           c[i][j]=a[i][j]-b[i][j];
    
       }
       System.out.println("martix result");
       }
       for(int i=0;i<a.length;i++)
       {
        for(int j=0;j<a[i].length;j++)
        {

            System.out.print(c[i][j]+"  ");
        }
         System.out.println();
       }
     }
     
     else
     {
        System.err.println("Do not print martix in unorder");
     }
    }
}

