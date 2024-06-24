package _18_OOPS._02_MethodOverloading;
public class _03_ConstructorOverLoading {

    _03_ConstructorOverLoading() {
        System.out.println("Default cons");
    }

    _03_ConstructorOverLoading(int a) {
        System.out.println(a);
    }

    _03_ConstructorOverLoading(String name , int a){
        System.out.println(name + a);
    }

    public static void main(String[] args) {
        _03_ConstructorOverLoading obj = new _03_ConstructorOverLoading();
        _03_ConstructorOverLoading obj1 = new _03_ConstructorOverLoading(5);
        _03_ConstructorOverLoading obj2 = new _03_ConstructorOverLoading("Ram" , 4);
    }
}