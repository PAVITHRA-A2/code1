interface AA
{
    void display();
}
interface BB
{
    void show();
}
class Myclass
{
    void summa()
    {
        System.out.println("Summa");
    }
}
class CC extends Myclass implements AA,BB

{
    public void display()
    {
        System.out.println("in display");
    }
    public void show()
    {
        System.out.println("In show");
    }

}
public class MutipleInheritance
{
   public static void main(String[] args) 
   {
        CC  cc = new CC();
        cc.display();
        cc.show();
        cc.summa();
   }
}