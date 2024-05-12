package _09_Array.EQ;
import java.util.Arrays;
public class _14_BubbleSort {
    public static void main(String[] args) {
        int[] arr = {6,1,7,3,8,2,4};

        for (int i = 0; i < arr.length-1; i++) {  //length-1 bcoz do elements ko ek sath hi kelrhe h na compare .. to hme pinter last-1 waale index tk hi chahiye
            for(int j=0; j< (arr.length-1)-i ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
