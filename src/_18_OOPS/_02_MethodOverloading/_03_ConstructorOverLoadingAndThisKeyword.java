package _18_OOPS._02_MethodOverloading;

public class _03_ConstructorOverLoadingAndThisKeyword {
    int age;

    _03_ConstructorOverLoadingAndThisKeyword() {
        this(10);
        System.out.println("Default cons");
    }

    _03_ConstructorOverLoadingAndThisKeyword(int a) {
        this(50,"Ramu");
        System.out.println(a + "Para cons");
    }

    _03_ConstructorOverLoadingAndThisKeyword(int a , String name){
        System.out.println(name + a + "Para cons");
    }

    public static void main(String[] args) {
        _03_ConstructorOverLoadingAndThisKeyword obj = new _03_ConstructorOverLoadingAndThisKeyword();
    }
}