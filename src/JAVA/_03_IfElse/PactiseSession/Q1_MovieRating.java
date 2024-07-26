//Accept rating of the movie as double and Movie name as String and Print like following:
//I/P:-
        //4.5 for super hit ....3.5 for hit....1.5 for flop
        //Animal
//O/P:-
        //Animal is a super Hit
package JAVA._03_IfElse.PactiseSession;

import java.util.Scanner;

public class Q1_MovieRating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Movie rating b/w 1-5");
        double r = sc.nextDouble();

        sc.nextLine();   //Dummy nextLine to acquire 'enter'

        System.out.println("Movie Name");
        String name = sc.nextLine();

        if(r>4.0) System.out.println(name + " is a SuperHit");
        else if(r>2.0) System.out.println(name + " is Hit");
        else  System.out.println(name + " is Flop");

    }
}
