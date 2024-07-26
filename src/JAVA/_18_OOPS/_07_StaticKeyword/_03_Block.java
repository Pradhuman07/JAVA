package JAVA._18_OOPS._07_StaticKeyword;
public class _03_Block {

    static{
        System.out.println("Static block");
    }


    void fun(){
        System.out.println("Fun method");
    }

    _03_Block(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        //khaali run krke dkho

        _03_Block obj = new _03_Block();
        _03_Block obj2 = new _03_Block();
        obj.fun();
        _03_Block obj3 = new _03_Block();

    }

    static {
        System.out.println("Static block 2");
    }
}

//--static blocks
//    --Automatically Executed only once in lifetime of a class, right when the class is first used.
//      [main method bss bna bhar lo...khaali bhi run kroge to bhi static block execute hojyega]
//    --First use of class can be a object creation or the static call.
//    --Can be used multiple times - Hierarchy will be followed