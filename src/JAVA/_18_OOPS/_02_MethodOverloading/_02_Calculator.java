package JAVA._18_OOPS._02_MethodOverloading;
public class _02_Calculator {

    public static int sum(int x , int y){
        return x+y;
    }
    public static int sum(int x, int y , int z) {
        return x+y+z;
    }
    public static int sum(int x, int y , int z , int w) {
        return x+y+z+w;
    }

    public static float sum(float x , int y){
        return x+y;
    }   //RT different!
    public static float sum(int x , float y){
        return x+y;
    }

    public static void main(String[] args) {
        System.out.println(sum(2,3));
        System.out.println(sum(2,3,4));
        System.out.println(sum(2,3,4,5));
        System.out.println(sum(5.2f,1));
        System.out.println(sum(1,5.2f));
        System.out.println(sum(1,2));
    }
}
//If the methods have different numbers of parameters, then it is considered method overloading, even if their return types are different. The key requirement for method overloading is that the methods must have different parameters list.

//But only return type different and no other change...then not method overloading...also it will give you compile time error