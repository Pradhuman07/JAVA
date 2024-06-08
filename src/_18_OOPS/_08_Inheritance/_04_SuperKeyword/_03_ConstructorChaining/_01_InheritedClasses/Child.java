package _18_OOPS._08_Inheritance._04_SuperKeyword._03_ConstructorChaining._01_InheritedClasses;

class GrandParent{
    GrandParent(){
        System.out.println("GrandParent,Def Cons");
    }
}

class Parent extends GrandParent{
    Parent() {
        System.out.println("Parent Class,Def Cons");
    }
}

public class Child extends Parent {
    Child() {
        System.out.println("Child Class,Def Cons");
    }

    public static void main(String[] args) {
        Child obj = new Child();
    }
}