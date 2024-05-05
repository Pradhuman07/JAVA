package _09_Array.Class;
import java.util.Arrays;
public class _10_ReverseWithoutUsingNewArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        for(int i=0,j=arr.length-1; i< arr.length ; i++,j--){
            int temp = arr[i];
            arr[i] = arr[j];    //bijli bna do
            arr[j] = temp;

            if(i>j || i==j) break;  //i>j if length=5 means no. of elements=even and i==j if length = even but no. of elements = odd i.e we have the middle one
        }
        System.out.println(Arrays.toString(arr));
    }
}
//            int temp = arr[i];
//        for(int i=0 ; i<arr.length-1 ; i++){
//            arr[i] = arr[i+1];
//            arr[i+1] = temp;
//        }
