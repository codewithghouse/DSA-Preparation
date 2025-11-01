package condistatement;

import java.util.Scanner;

public class ifelse {
    public static void main(String[] args) {
        System.out.println("if else statement examples : ");
        System.out.println("enter your age here :");
        Scanner sc= new Scanner(System.in);
        int age= sc.nextInt();
        if(age>=18){
            System.out.println("You Can Vote");
        }else{
            System.out.println("Sorry ,You Cannot Vote");
        }
    }
}
