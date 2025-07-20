class Overload
{
 double num1;
 double num2 ;
 double result;

 void sum(int a,int b)
 {
   num1=a;
   num2=b;
   result=num1+num2;
   System.out.println(result);
 } 
  void sum(double a,int b)
 {
    num1=a;
   num2=b;
   result=num1+num2;
   System.out.println(result);
 } 
  void sum(double a,double b)
 {
    
    num1=a;
   num2=b;
   result=num1+num2;
   System.out.println(result);
 } 
}

public class MethodOverload
{
    public static void main(String[] args) 
    {
       Overload obj= new Overload();
       obj.sum(10,10);
       obj.sum(10.2,10) ;
       obj.sum(10.5,10.3);
    }
}