package _30_Whizz._27_StaticKeyword;

class Test1 {
    static int x = 10;
    public static void main(String[] args){
        Test1 t1 = new Test1();
        Test1 t2 = new Test1();
        System.out.print(x + " ");
        System.out.println(x);
    }
}
//x is a global variable. So changing the value of x with the use of t1 object will change the value globally. So t2.x will also be equal to 20.
