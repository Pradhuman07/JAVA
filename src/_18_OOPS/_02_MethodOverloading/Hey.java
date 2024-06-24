package _18_OOPS._02_MethodOverloading;

public class Hey {
    public static int sum(int x , int y){return x+y;}  //let it be comment out and run and then run when comment off
    public static float sum(float x , int y){
        return x+y;
    }   //RT different!
    public static int sum(int x, int y , int z) {
        return x+y+z;
    }

    public static void main(String[] args) {
        System.out.println(sum(5,2));
        System.out.println(sum(5,2,3));
//        System.out.println(sum(5f,2));       //comment out once
//        System.out.println(sum(5.2,2));
    }
}
