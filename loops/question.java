package loops;

import java.util.Scanner;

// keep entering numbers till user enters a  multiple of 10
public class question {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        do{
            System.out.println("enter the number : to play this game ");
                      
            int n = sc.nextInt();
  ;
            if(n%10==0){
               continue;
            }
            System.out.println(n);
        }while(true);
    }
    
}
