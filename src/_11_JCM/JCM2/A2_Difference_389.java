package _11_JCM.JCM2;

import java.util.Scanner;

public class A2_Difference_389 {

    public static char letterAdded(String s , String t){

        int sumS=0;
        int sumT=0;

        for(char ch : s.toCharArray())
            sumS+=ch;

        for (char ch : t.toCharArray())
            sumT+=ch;

        return (char)(sumT-sumS);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String s:- ");
        String s = sc.nextLine();
        System.out.println("Enter String t:- ");
        String t = sc.nextLine();

        System.out.println("Answer:- " + letterAdded(s,t));
    }
}
