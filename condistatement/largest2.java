package condistatement;

import java.util.Scanner;

public class largest2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of a :");
        int a = sc.nextInt();
        System.out.println("enter the value of b : ");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("the a is greater than b"+" a="+a);
        }else{
            System.out.println("the b is greater than a"+" b=  "+b);
        }
    }
}
