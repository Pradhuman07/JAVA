package _09_Array.EQ;
import java.util.Arrays;
public class _16_LeftRotateKtimes {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int k = 43;

        k=k%n;       //43%5=3

        for(int j=1 ; j<=k ; j++){      //k times...like patterns

            {                               //1 time
                int temp = arr[0];

                for (int i = 0; i < n - 1; i++)
                    arr[i] = arr[i + 1];

                arr[n - 1] = temp;
            }

        }

        System.out.println(Arrays.toString(arr));

    }
}
