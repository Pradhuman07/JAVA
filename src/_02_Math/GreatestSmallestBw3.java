package _02_Math;

public class GreatestSmallestBw3 {
    public static void main(String[] args) {

        int a=5,b=8,c=3;

        int greatest = Math.max(Math.max(a,b),c);
        int smallest = Math.min(Math.min(a,b),c);

        System.out.println("Greatest of 3 is: " + greatest);
        System.out.println("Smallest of 3 is: " + smallest);

    }
}
