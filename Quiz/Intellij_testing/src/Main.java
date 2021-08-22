class Base {
    public void Print() {
        System.out.println("Base");
    }
}

class Derived extends Base {
    public void Print(){
        System.out.println("Derived");
    }
}

class Main{
    public static void DoPrint(Base o){
        o.Print();
    }
    public static void main(String[] args){
        Base a = new Base();
        Base x = new Base();
        Base y = new Derived();
        //a = (Base)y;
        Derived z = new Derived();
        DoPrint(x);
        DoPrint(y);
        DoPrint(z);
    }
}