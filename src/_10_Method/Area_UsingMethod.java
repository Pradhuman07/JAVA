package _10_Method;

public class Area_UsingMethod {
    public static int getArea(int a , int b){
        return a*b;
    }

    public static void main(String[] args) {
        int l=4,b=3;
        int Area = getArea(l,b);
        System.out.println(Area);
    }
}
