package _18_OOPS._08_Inheritance._04_SuperKeyword.X;

class  A{
    int age=4;
}

public class Main extends A{

    void joy(int a){
        age=a;                      //Super.age likhne ki zrurt nhi pdi...kyun?
        System.out.println(age);    //Kyoki hm non-static variable ko non static method mein (ek hu=i class since inheritance horha) call krrhe
    }

    public static void main(String[] args) {
        Main obj = new Main();
        obj.joy(50);
    }

//    static void fun(){   //error
////        age = 4;   //error
//        super.age=3;
//    }
}