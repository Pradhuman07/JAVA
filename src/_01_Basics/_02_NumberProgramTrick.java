package _01_Basics;

public class _02_NumberProgramTrick {
    public static void main(String[] args) {

    // Special powers of / & % by powers of 10
    // #(/) to reduce the number
    // #(%) to get last digit(s) of number

        System.out.println(125 / 10);
        System.out.println(125 / 100);
        System.out.println(125 / 1000);

        System.out.println(125 % 10);
        System.out.println(125 % 100);
        System.out.println(125 % 1000);
    }
}
//
//        125/10 = 12
//        125%10 = 5
//
//        125/100 = 1
//        125%100 = 25
//
//        0125/1000 = 0
//        125%1000 = 125
