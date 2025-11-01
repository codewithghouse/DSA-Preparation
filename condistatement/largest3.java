package condistatement;

import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Largest Of Three Numbers");
        System.out.println("enter the valu of a :");
        int a= sc.nextInt();
        System.out.println("enter  the value of b :");
        int b = sc.nextInt();
     System.out.println("enter the value of c  : ");
     int c= sc.nextInt();

    //  if else statment
    if(a>=b && a>=c){
        System.out.println("the a is greater than b and c");
    }else if(b>=c){
        System.out.println("the b is greater than a and c");
    }else{
        System.out.println("the c is greater than a and b ");
    }
    }
}
