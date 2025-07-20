class A 
{
    int a=10;
  
  void display()
  {
System.out.println("in parent" );
 
  } 
}
class B extends A
{
    int c=20;
 void display()
 {
   super.display();
    
    System.out.println("in parent" + super.a);
 

 System.out.println("in chlid"+c);
 
 }
}

public class Super
{
  public static void main(String[] args)
   {
      B b = new B();
      b.display();
  }
}