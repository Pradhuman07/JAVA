package _18_OOPS._08_Inheritance._04_SuperKeyword._02_ConstructorCalling;

class Parent6 {
    Parent6(int a) {
        System.out.println(a);
        System.out.println("Parent6 , Parametrized constructor");
    }
}

public class Child6 extends Parent6 {
    Child6() {
        super(10);   //ab nhi aayega error ...Only Para cons call
        System.out.println("Child6 Class,Default Constructor");
    }

    public static void main(String[] args) {
        Child6 obj = new Child6();
    }
}