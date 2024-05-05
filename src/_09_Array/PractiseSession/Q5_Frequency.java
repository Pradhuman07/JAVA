package _09_Array.PractiseSession;

public class Q5_Frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 2, 3, 4, 2, 4, 2, 3, 4, 2};

        for (int i = 0; i < arr.length; i++) {
            int count = 1;      //count or temp ko fori ke andr forj ke bahr hi rkhna destroy nhi hogi + refresh hoti jyegi
            int temp = arr[i];
            if (arr[i] != -1) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == temp) {
                        count++;
                        arr[j] = -1;
                    }
                }
                System.out.println(temp + " occurs " + count + " times.");
            }
        }
    }
}
