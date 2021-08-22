class Test1 {
    protected char y;
    protected String str;
}

class main1 {
    public static void main(String args[]){
        int x;
        x = 5;
        Test1 t = new Test1();
        System.out.println(x);
        System.out.println((int)t.y);

        x = 5;
        t.y = 'a';
        System.out.println(t.y);
        System.out.println(t.str);
    }
}
