package JAVA._18_OOPS._14_SuperKeyword_and_CC_DifferentClass._02_ConstructorCalling;

class Parent2 {
    Parent2() {
        System.out.println("Parent2 Class,Default Constructor");
    }
}

public class Child2 extends Parent2 {
    Child2() {
        System.out.println("Child2 Class,Default Constructor");
    }

    public static void main(String[] args) {
        Child2 obj = new Child2();
    }
}

//-- If we do not call the Parent class constructor by ourself then compiler will automatically call it by its own
