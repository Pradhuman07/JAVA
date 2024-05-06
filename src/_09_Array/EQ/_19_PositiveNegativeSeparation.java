//65- Move all the negative elements on left side and positive elements on right side O(n).
package _09_Array.EQ;
import java.util.Arrays;
public class _19_PositiveNegativeSeparation {
    public static void main(String[] args) {
        int[] arr = {6, 2, -4, 5, -40, 80, 96, -126, 77, -60 , 56};

        int i = 0, j = arr.length - 1;       //i=0,j=10
        while (i < j) {
            while (i < arr.length && arr[i] < 0) {   //We are skipping i`s whose arr[i] is <0 bcoz we are finding arr[i] which is +ve to swap with arr[j] which is -ve
                i++;
            }                        //condition false therefore loop didn't run therefore; i=0,arr[i]=6 hi rha which is >0 therefore we will find arr[j]<0 and swap
            while (j >= 0 && arr[j] > 0) {   //We are skipping j`s whose arr[j] is > 0 bcoz we are finding arr[j] which is -ve to swap with arr[j] which is +ve
                j--;
            }                   //condition true then loop runs 2nd time then cond false therfore; j=9,arr[j]=-60 which is < 0 therfore now swapping will occur with arr[i]
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}

//Process:-
// -ves ko left side krte jao using i pointer...+ves ko right using j pointer
//i side se bdhege agr arr[i]<0 then do nothing just proceed further i.e iterate to the next one(i++)
//same with the right side...if arr[j]>0 then do nothing just proceed further(j--)
//But if arr[i]>0 and arr[j]<0 then swap them
//repeat these process till i<j wrna middle ke 2 -ve +ves hmesha ek doosre ko swap krte reh jaenge

// Method-1:-  Arrays.sort(arr); khtm