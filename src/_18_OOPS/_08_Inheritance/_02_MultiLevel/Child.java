package _18_OOPS._08_Inheritance._02_MultiLevel;

class GrandParent{
    void greet(){
        System.out.println("Namaskar");
    }
}

class Parent extends GrandParent{

}

public class Child extends Parent{
    public static void main(String[] args) {
        Child obj = new Child();
        obj.greet();
    }
}

