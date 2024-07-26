package JAVA._09_Array.EQ;
public class _22_21_Optimized_Bitmap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 5, 2, 2, 7};      //Note:- Negative elements nhi hona chahiye...Negative indices nhi hoti na kyoki

        int max = Integer.MIN_VALUE;

        for(int a:arr)
            max = Math.max(a,max);

        int[] freq = new int[max+1];   //+1 in order to store  (1 at index 1 and not 0) (2 at index 2 and not 1) (max at arr[max] and not arr[max-1])

        for(int a : arr)
            freq[a]++;         //by default freq[Element=Index]=0

        for (int i = 0 ; i < freq.length ; i++)
            if(freq[i]>0) System.out.println(i + "->" + freq[i]);

    }
}
