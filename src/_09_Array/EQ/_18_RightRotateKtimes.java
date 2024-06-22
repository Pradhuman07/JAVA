package _09_Array.EQ;
import java.util.Arrays;
public class _18_RightRotateKtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};    //5,1,2,3,4
        int k = 43;

        int n = arr.length;
        k = k % n;              //43%3=3

        for(int j=1 ; j<=k ; j++){    //k times
            {                           //1 time
                int temp = arr[n - 1];

                for (int i = n - 1; i > 0; i--)
                    arr[i] = arr[i - 1];

                arr[0] = temp;
            }
        }
            System.out.println(Arrays.toString(arr));
    }
}
