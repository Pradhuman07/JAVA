package JAVA._18_OOPS._14_SuperKeyword_and_CC_DifferentClass._02_ConstructorCalling;

class Parent7 {
    Parent7(int a) {
        System.out.println(a);
        System.out.println("Parent7 , Parametrized constructor");
    }
    Parent7(){
        this(78);
        System.out.println("Parent7,Default");
    }
}

public class Child7 extends Parent7 {
    Child7() {
        super(); //not possible to call both ... why?
//        super(10);
        System.out.println("Child7 Class,Default Constructor");
    }

    public static void main(String[] args) {
        Child7 obj = new Child7();
    }
}