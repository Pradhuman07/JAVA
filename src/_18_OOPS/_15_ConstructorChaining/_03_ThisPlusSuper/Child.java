package _18_OOPS._15_ConstructorChaining._03_ThisPlusSuper;

class Parent {
    Parent(int a) {
        System.out.println(a);
        System.out.println("Parent7 , Parametrized constructor");
    }
    Parent(){
        this(78);
        System.out.println("Parent7,Default");
    }
}

public class Child extends Parent {
    Child() {
        super(); //not possible to call both ... why?
//        super(10);
        System.out.println("Child7 Class,Default Constructor");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}