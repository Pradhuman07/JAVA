//16.Given an integer array A[] and a character array B[] of equal lengths where every character of the array is from the set {‘a’, ‘b’, ‘c’}. Elements of both arrays are associated with each other i.e. the value of B[i] is linked to A[i] for all valid values of i. The task is to find the value min(a + b, c).

//Examples:

//Input:-
            // A[] = { 3 ,  6 ,  4 ,  5 ,  6 }
            // B[] = {‘a’, ‘c’, ‘b’, ‘b’, ‘a’}
//Output: 6

//Input:-
            // A[] = { 4 ,  2 ,  6 ,  2 , 3  }
            // B[] = {‘b’, ‘a’, ‘c’, ‘a’, ‘b’}
//Output: 5
package JAVA._09_Array.PractiseSession;
public class Q16_Mapping {
    public static void main(String[] args) {
        int[]  A = { 3 ,  6 ,  4 ,  5 ,  6 };
        char[] B = {'a', 'c', 'b', 'b', 'a'};

        int minA = Integer.MAX_VALUE;
        int minB = Integer.MAX_VALUE;
        int minC = Integer.MAX_VALUE;

        for (int i = 0; i < B.length; i++) {
            char ch = B[i];
            switch (ch){
                case 'a' -> minA = Math.min(minA , A[i]);
                case 'b' -> minB = Math.min(minB , A[i]);
                case 'c' -> minC = Math.min(minC , A[i]);
            }
        }

        System.out.println(Math.min(minA+minB , minC));
    }
}