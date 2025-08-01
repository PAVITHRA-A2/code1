//STRING TO INTEGER (ATOI)
/*Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

The algorithm for myAtoi(string s) is as follows:

Whitespace: Ignore any leading whitespace (" ").
Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.
Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of the string is reached. If no digits were read, then the result is 0.
Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.*/
import java.util.*;
class Solution {
    public int myAtoi(String s)
    {
        s=s.trim();
        long num =0;

        if(s.isEmpty())
        {
            return 0;
        }
        int i=0;
        int sign =1;
        int n = s.length();
        
        if(s.charAt(i)=='-'|| s.charAt(i)=='+')
        {
            sign =(s.charAt(i)=='-')? -1:1;
            i++;
        }
        while(i<n && Character.isDigit(s.charAt(i)))
        {
           num = num*10+(s.charAt(i)-'0');
           if(num*sign >Integer.MAX_VALUE)
           {
            return Integer.MAX_VALUE;
           }
           if(num*sign < Integer.MIN_VALUE)
           {
            return Integer.MIN_VALUE;
           }
           i++;
        }
        return (int)(sign*num);
    }
}
public class Atoi{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
          Solution so=new Solution();
          String s = sc.nextLine();
          int output = so.myAtoi(s);
          System.out.println(output);

    }
}