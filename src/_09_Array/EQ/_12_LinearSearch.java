package _09_Array.EQ;
public class _12_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int target = 2;
        int foundAt=-1;

        int i=0;
        for (i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                foundAt=i;
                break;
            }
        }
        System.out.println(foundAt==-1 ? "Not Found" : "Found at index " + foundAt );
    }

}
