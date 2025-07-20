

interface A
{
    String name="pavithra";
    public void show();
}

class Aimp implements A
{
 public  void show()
    {
        System.out.println("in class");
    }
}



public class Interface
{
    public static void main(String[] args)
    {
        Aimp obj = new Aimp();
        obj.show();
         String na =A.name;
         System.out.println(na);
    }
}