package _18_OOPS._08_Inheritance._01_SingleLevel;

class Parent{
    void greet(){
        System.out.println("Namaste");
    }
}

public class Child extends Parent{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
    }
}