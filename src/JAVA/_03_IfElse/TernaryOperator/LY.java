package JAVA._03_IfElse.TernaryOperator;
public class LY {
    public static void main(String[] args) {
        int year=1800;
        System.out.println((year%400==0) || ((year)%4==0 && year%100!=0 )?"Leap":"Not Leap");
    }
}
