package loops;

import java.util.Scanner;

public class oneton {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number");
        int n= sc.nextInt();
        int a=1;
        while(a<=n){
            System.out.print(a+" ");
            a++;
        }
       System.out.println("");
    }
}
