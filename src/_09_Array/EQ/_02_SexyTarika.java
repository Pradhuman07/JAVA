package _09_Array.EQ;
//only for greatest not its index
public class _02_SexyTarika {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 15, 2, 2, 6};

        int max = Integer.MIN_VALUE;

        for(int a:arr)
            max = Math.max(a,max);

        System.out.println(max);
    }
}