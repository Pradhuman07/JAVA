package _12_OOPS;

public class MethodOverloading {
    public static void joy() {
        System.out.println("joy");
    }
    public static void joy(int x) {
        System.out.println("joy1");
    }
    public static void joy(int x, int y) {
        System.out.println("joy2");
    }
    public static void joy(float x) {
        System.out.println("joy3");
    }

    public static void main(String[] args) {
        joy();
        joy(2);
        joy(2, 3);
        joy(2.0f);
    }
}
//2 ways
//i)Change No. of Parameters
//ii)Change type of Parameters