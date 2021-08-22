// file name: Main.java

class Base {
    protected void foo() {System.out.println("Base"); }
}

class Derived extends Base {
    void foo() {System.out.println("Derived"); } // cannot have weaker access specifier
    // need to have protected or private (not public)
}

public class Main{
    public static void main(String args[]){
        Derived d = new Derived();
        d.foo();
    }
}
