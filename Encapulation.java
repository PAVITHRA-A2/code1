 class Demo
{
    private int age=20;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}



public class Encapulation
{
    public static void main(String[] args)
    {
   Demo obj = new Demo();
      obj.setAge(50);
      System.out.println(obj.getAge());  
    }
}