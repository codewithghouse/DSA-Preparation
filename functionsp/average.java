package functionsp;

import java.util.Scanner;

public class average {

    // method to calculate the average of three numbers
    public static int avg(int a,int b,int c){
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b :");
        int b = sc.nextInt();
        System.out.println("enter the value of c :");
        int c= sc.nextInt();
        System.out.println(".....calculating the average please wait ");

        // function callling
        System.out.println("the average of three numbers are :"+avg(a, b, c));

    }
}
