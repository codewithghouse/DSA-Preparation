package condistatement;

import java.util.Scanner;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Income Tax Calculator");
        System.out.println("enter the Income ");
        int income = sc.nextInt();
        int tax;
   
        if(income <= 500000){
        
           tax=0;
           System.out.println(tax);
        }else if(income >=500000 && income < 1000000){
            tax = (int)(income*0.2);
            System.out.println(tax);
        }else{
            tax= (int)(income*0.3);
            System.out.println(tax);
            System.out.println("-------");
            System.out.println("the problem end: ");
        }
        System.out.println("tax to be paid is : "+tax);
    }
}
