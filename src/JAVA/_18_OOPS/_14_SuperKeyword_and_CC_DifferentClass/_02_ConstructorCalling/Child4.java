package JAVA._18_OOPS._14_SuperKeyword_and_CC_DifferentClass._02_ConstructorCalling;

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

//pehle parent class ka internal constructor call hua hoga internaly