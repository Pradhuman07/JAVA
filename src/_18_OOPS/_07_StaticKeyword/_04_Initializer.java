package _18_OOPS._07_StaticKeyword;
public class _04_Initializer {
    int age;

    {
        System.out.println("Initializer block");
    }

    _04_Initializer(){
        age = 14;
        System.out.println("Constructor");
    }

    void fun(){
        System.out.println("Fun");
    }

    static{
        System.out.println("Static block");
    }

    public static void main(String[] args) {
        _04_Initializer obj = new _04_Initializer();
        _04_Initializer obj2 = new _04_Initializer();
        obj.fun();
    }


}

//--Initializer block
//    --Automatically executed only once in lifetime of an object, right before the constructor for each object
//          [main method me bs ek method bna bhar lo aur kuch mt kro..run kro to bhi execute hojyega]
//    --Can be used multiple times - Hierarchy will be followed
