
import java.util.Scanner;


public class EnhanceLoop
{
  public static void main(String args[])
  {
    int[][] a=new int[3][];
    a[0]=new int[3];
    a[1]= new int[5];
    a[2]= new int[2];
    Scanner sc = new Scanner(System.in);

    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.println("Matrix: "+" "+i+j);
            a[i][j]=sc.nextInt();
            
        }
        System.out.println();
    }
    for(int i=0;i<a.length;i++)
    {
        for(int j=0;j<a[i].length;j++)
        {
            System.out.print(" "+a[i][j]+" ");
        }
        System.out.println();
    }
  }
}
