package _18_OOPS._08_Inheritance._04_SuperKeyword._02_ConstructorCalling;

class Parent7 {
    Parent7(int a) {
        System.out.println(a);
        System.out.println("Parent7 , Parametrized constructor");
    }
    Parent7(){
        System.out.println("Parent7,Default");
    }
}

public class Child7 extends Parent7 {
    Child7() {
        super(10);
//        super(); //not possible to call both
        System.out.println("Child7 Class,Default Constructor");
    }

    public static void main(String[] args) {
        Child7 obj = new Child7();
    }
}