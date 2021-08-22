class A_fixed
{
    // had to add a default constructor to avoid failure
    public A_fixed()
    {
        System.out.println("A_fixed: No constructor arguments");
    }

    public A_fixed(String s) 
    {
        System.out.print("A_fixed: This is A_fixed, and your argument is ");
        System.out.println("̈́'" + s + "'");
    }
}
  
public class B_fixed extends A_fixed 
{
    public B_fixed(String s) 
    {
        System.out.println("B_fixed: B");
    }
    public static void main(String[] args) 
    {
        new A_fixed("Argument from non-extended object");
        new B_fixed("C");
        System.out.println(" ");
    }
}
