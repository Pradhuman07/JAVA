package _07_Switch;

import java.util.Scanner;

public class EQ42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day Number");
        int day = sc.nextInt();

        String res=switch(day){
            case 1 -> "Monday";
            case 2,9,16 ->"Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> "Wrong Input";
            case 7 -> "Wrong Input";
        };

        System.out.println(res);
    }
}
