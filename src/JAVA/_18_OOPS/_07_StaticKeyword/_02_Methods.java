package JAVA._18_OOPS._07_StaticKeyword;
public class _02_Methods {

    static void fun(){
        System.out.println("Hello");
    }

    void cry(){     //non-static method
        fun();
    }

    public static void main(String[] args) {      //static method
        fun();     //static method

        _02_Methods.fun();  //class name se

        _02_Methods obj = new _02_Methods();
        fun();      //object name se
    }

}

//--methods
//    --Both static and non static methods can invoke static methods.
//    --Should be invoked by class name.
//    --If tried to invoke via object's reference then reference name will be replaced by class name at runtime.
//    --Static method can not access instance fields & methods     (except main method)