package _18_OOPS._07_StaticKeyword;
public class _01_Variable {
    static int age=3;

    void fun(){   //non-static method
        System.out.println(age);
    }

    public static void main(String[] args) {    //static method
        age = 21;

        _01_Variable obj = new _01_Variable();
        obj.fun();
    }


}
//--Static variables (accessed by class name) (global hote h)

//    --Can only be made at class level
//    --Gets loaded into memory with the first use of class.
//    --There will be only one copy for all the objects (Sharing of data-Architecture)
//    --Both static and non static methods can access static variables.