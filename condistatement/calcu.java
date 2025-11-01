package condistatement;

import java.util.Scanner;

public class calcu {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the value of a :");
       int a= sc.nextInt();
       System.out.println("enter the value of b :");
       int b=sc.nextInt();
       System.out.println("please select the operator \"+ , -,*,/,%\"");
       System.out.println("+ , -,*,/,%");
       char operator = sc.next().charAt(0);
       switch(operator){
        case '+':{
            System.out.println(a+b);
            break;
        }
        case '-':{
            System.out.println(a-b);
            break;
        }
        case '*':{
            System.out.println(a*b);
            break;
        }
        case '/':{
            System.out.println((int)(a/b));
            break;
        }
        case '%':{
            System.out.println((int)(a%b));
            break;
        }
        default:{
            System.out.println("please select the valid operator");
        }
       }

       

        
    }
}
