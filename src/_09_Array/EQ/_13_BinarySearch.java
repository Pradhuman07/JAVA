package _09_Array.EQ;

public class _13_BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        //Requirement of Binary Search:- Data should be sorted

        int se = 6;
        int index = -1;

        int start=0, end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==se){
                index=mid;
                break;
            }
            else if(arr[mid]>se) end=mid-1;
            else start=mid+1;
        }
        System.out.println(index==-1? "SE not found" : "SE Found at index " + index);
    }
}
