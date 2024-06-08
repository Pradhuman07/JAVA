package _18_OOPS._08_Inheritance._04_SuperKeyword._02_ConstructorCalling;

class Parent4 {

}

public class Child4 extends Parent4 {
    Child4(){
        System.out.println("Child4 Constructor");
    }
    public static void main(String[] args) {
        Child4 obj = new Child4();
    }
}
