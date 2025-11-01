package practice;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the table number");
        int n=sc.nextInt();
        if(n<1){
            System.out.println("enter the positve to number to print the table :");

        }else{
            for(int i=1;i<=10;i++){
                System.out.println(i*n);
            }
        }
    }
}
