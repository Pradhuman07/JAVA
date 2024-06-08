package _18_OOPS._08_Inheritance._04_SuperKeyword._02_ConstructorCalling;

class Parent3 {
    Parent3() {
        System.out.println("Parent3 Class,Default Constructor");
    }
}

public class Child3 extends Parent3 {
    public static void main(String[] args) {
        Child3 obj = new Child3();
    }
}
//Child3 class ka constructor internally to bna h na..aur wo obj create hote hi call hoga