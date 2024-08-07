package JAVA._18_OOPS._14_SuperKeyword_and_CC_DifferentClass._01_MethodCalling;

class Parent{
    int a=4;
    void greet(){
        System.out.println("greeting");
    }
}

public class Child extends Parent{

    void fun(){
        super.greet();                  //super keyword -> used to call methods/constructor/variable of parent class in the child class
        System.out.println(super.a);
        System.out.println("funning");
    }

//    static void joy(){       //Why Error?
//        super.greet();
//    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.fun();
    }
}
// Bina Parent class ke super keyword likhege to error aayega kya?
// ans. Nhi aayega... kyoki by default hr class ki ek parent class hoti h which is Object class to super keyword object class ke methods ko call krne lgega