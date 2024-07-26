package JAVA._18_OOPS._09_MethodOverriding;
//Also Called Run-time Polymorphism

class GrandParent{
    void greet(){
        System.out.println("Ram Ram");
    }
}

class Parent extends GrandParent{
    void greet(){
        System.out.println("Namaste");
    }
}
public class Child extends Parent{
    void greet(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();   //nearby greet ko call krega
    }
}