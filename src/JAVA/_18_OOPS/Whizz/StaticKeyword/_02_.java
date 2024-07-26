package JAVA._18_OOPS.Whizz.StaticKeyword;

class static_out {
    static int x;            //global variable
    static int y;            //global variable
    void add(int a, int b){
        x = a + b;
        y = x + b;      //remember x and y are global variable so unki latest value change hi everywhere value hogi
    }
}

class static_use {
    public static void main(String[] args){
        static_out obj1 = new static_out();
        static_out obj2 = new static_out();

        int a = 2;

        obj1.add(a, a + 1);        //x=5,y=8
        obj2.add(5, a);            //x=7,9

        System.out.println(static_out.x + " " + static_out.y);     //x and y are global variable so obj1.x=obj2.x=7 and obj1.y=obj2.y=9
    }
}
