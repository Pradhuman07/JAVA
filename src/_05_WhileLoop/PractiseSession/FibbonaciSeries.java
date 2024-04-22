package _05_WhileLoop.PractiseSession;
public class FibbonaciSeries {   //upto 10 terms
    public static void main(String[] args) {
                          // 0,1,1,2,3,5,8,13,21,34
                          // first=0,second=1 fix ...third = first + second
        int first = 0;
        int second = 1;
        int n = 10;
        int third;
        System.out.println(first);
        System.out.println(second);

        for (int i = 1; i <= (n-2); i++) {
            third = first + second;
            System.out.println(third);

            first = second;
            second = third;
        }
    }
}
//\n new line character