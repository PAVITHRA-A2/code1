
import java.util.Scanner;

class pNumber
{
   // boolean isPrime = true;
     public int isPrime(int num)
     {

         if(num<=1)
         {
            return 0;
         }
         else{
            for(int i=2;i<=num/2;i++)

            {
                if(num%i ==0)
                {
                    return 0;
                }
            }
         }
         return 1;
     }
}

public class PrimeNumber
{
    public static void main(String aegs[])
    {
       Scanner sc = new Scanner(System.in);
       int num = sc.nextInt();
       pNumber p = new pNumber();
      int result = p.isPrime(num);
       if(result ==1)
       {
        System.out.println(num + ": It is Prime Number");
       }
       else{
        System.out.println(num +": It is not Prime Number");
       }


    }
}