package JAVA._03_IfElse.Whizz;

import java.util.Scanner;
public class Q5_StudentResult
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Roll No: ");
        int roll = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter name: ");
        String name = sc.nextLine();

        System.out.println("Enter marks in Phy,Chem & Maths: ");

        int phy = sc.nextInt();
        int chem = sc.nextInt();
        int math = sc.nextInt();

        int tot = (phy+chem+math);
        double per = tot/3.0;

        String div="";

        if(per>70) div = "First";
        else if(per>50) div = "Second";
        else if(per>30) div = "Third";
        else div = "Fail";

        System.out.println("Roll No: " + roll);
        System.out.println("Name is: " + name);
        System.out.println("Total marks: " + tot);
        System.out.println("Percentage: " + per);
        System.out.println("Division: " + div);

    }
}

