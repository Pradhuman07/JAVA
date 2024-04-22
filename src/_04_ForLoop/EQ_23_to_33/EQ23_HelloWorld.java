//23- Accept an integer and Print hello world n times
package _04_ForLoop.EQ_23_to_33;

import java.util.Scanner;

public class EQ23_HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of time you want to print Hello World: ");
        int n = sc.nextInt();

        for(int i=1 ; i<=n ; i++)
            System.out.println("Hello World");

    }
}
