package JAVA._18_OOPS._03_ArrayOfObjects;
import java.util.Scanner;

public class Student {

    String name;
    int age;
    String branch;

    Student(String name , int age , String branch){
        this.name = name;
        this.age = age;
        this.branch = branch;
    }

    public String toString(){
        return "name = " + name + " , age = " + age + " , branch = " + branch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Students(objects): ");
        int size = sc.nextInt();

        sc.nextLine();  //Dummy nextLine...bcoz line 23 ka enter line 32 me jarha tha

        Student[] arr = new Student[size];    //Array of Objects...Remember DT of Object is class...int[] arr = new int[];

        for(int i=0 ; i<arr.length ; i++){

            System.out.println("Student " + (i+1) + ":-");

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();

            sc.nextLine();  //Dummy nextLine

            System.out.println("Enter branch: ");
            String branch = sc.nextLine();

//          Student obj = new Student(name , age , branch);
//          arr[i] = obj;

            arr[i] = new Student(name , age , branch);
        }

        for(Student obj : arr){           //arr ke andr jo elements h unka DT is Class
            System.out.println(obj);
        }
    }
}
//integer data store krne ke liye we use
// int arr[] = new int[]...
// kyoki integers ka DT = int..
// here we want to store objects..and objects ka DT is Class , therefore
// Class_Name arr[] = new Class_Name[] ;