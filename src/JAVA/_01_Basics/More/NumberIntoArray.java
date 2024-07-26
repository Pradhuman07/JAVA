//Approach:-
    //i)sbse phle to no. of digits nikalo
    //ii) utti size ki array bnao
    //iii) hr ek element ko nikaalke array mein daalte jao..using % and /
    //iv) Array ko reverse krdo using swapping

package JAVA._01_Basics.More;
import java.util.Arrays;
public class NumberIntoArray {
    public static void main(String[] args) {
        int num = 1234;

        int n = (int)Math.log10(num)+1;

        int[] arr = new int[n];

        for (int i=0; i<arr.length; i++) {
            arr[i] = num%10;
            num/=10;
        }

        System.out.println(Arrays.toString(arr));   //[5,4,3,2,1]

        int i=0 , j=arr.length-1;

        while(i<=j){                //(i<j) se bhi horha but (i<=j) is good

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));   //[1,2,3,4,5]
    }
}

