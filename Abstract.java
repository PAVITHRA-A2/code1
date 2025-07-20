
class Active 
{
    void display()
    {
        System.out.println("in class");
    }
}
public class Abstract
{
public static void main(String args[])
{
   Active a = new Active()
   {
            void display()
    {
        System.out.println("in  the ad class");
    }
   };
   a.display();
   
}
}
