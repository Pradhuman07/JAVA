package _09_Array.EQ;
public class _03_Smallest {
    public static void main(String[] args) {
        int[] arr = {5,9,1,2,10};

        int smallest = arr[0];
        int foundAt = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<smallest){
                smallest = arr[i];
                foundAt = i;
            }
        }

        System.out.println("Smallest Element: " + smallest);
        System.out.println("Found at index: " + foundAt);
    }
}
