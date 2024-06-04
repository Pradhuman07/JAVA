package _17_setques;

public class _01_PrintUniqueElements {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5,5};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==arr[j]) break;
            }
            System.out.println(arr[i]);
        }
    }
}
