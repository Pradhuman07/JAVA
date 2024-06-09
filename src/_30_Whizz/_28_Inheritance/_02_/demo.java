package _30_Whizz._28_Inheritance._02_;

class A {
    int i;
    void display() {
        System.out.println(i);
    }
}

class B extends A {
    int j;
    void display() {
        System.out.println(j);
    }
}

public class demo {
    public static void main(String[] args){
        B obj = new B();
        obj.i=1;
        obj.j=2;
        obj.display();   //Method Overriding...Nearby method call hoga ...b ka obj bnaya h to ussi ka..agr b me display nhi hota to A wala call hojata
    }
}