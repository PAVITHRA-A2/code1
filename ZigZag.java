
import java.util.*;

class Implzigzag
{
  public  String Call(int numrows, String s)
  {
    char[][] zigzag = new char[numrows][s.length()];
    int row=0,col=0;
    boolean down = true;
    for (int i =0; i < s.length(); i++)
     {
        zigzag[row][col]=s.charAt(i);

        if(down)
        {
            row++;
            if(row==numrows)
            {
                row-=2;
                col++;
                down = false;
            }
        }
        else{
            row--;
            col++;
            if(row==0)
            {
                down = true;
            }
        }
        
    }
    String re="";
    for (int i = 0; i < numrows; i++)
     {
        for (int j = 0; j < s.length(); j++) 
        {
            if(zigzag[i][j]!= '\u0000')
            {
            re+= zigzag[i][j];
            }
            
        }
        
    }
    return re;

  }
}

public class ZigZag
{
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int numrows = sc.nextInt();
       sc.nextLine(); 
       String s = sc.nextLine();

       Implzigzag ip = new Implzigzag();
       System.out.print(ip.Call(numrows, s));
   }
}