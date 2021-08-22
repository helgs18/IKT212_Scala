class A
{
    public A(String s) 
    {
        System.out.print("This is A, and your argument is ");
        System.out.println(s);
    }
}
  
public class B extends A 
{
    public B(String s) 
    {
        System.out.print("B");
    }
    public static void main(String[] args) 
    {
        new A("Alliballa");
        new B("C");
        System.out.println(" ");
    }
}
