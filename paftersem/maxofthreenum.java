package paftersem;

import java.util.Scanner;


public class maxofthreenum {
    //function to find the sum of three numbers
public static void maxthree(int a,int b,int c){
    if(a>b && a>c){
        System.out.println("A is greater");
        
    }
    else if( b>c){
        System.out.println("B is greator");
    }else{
        System.out.println("C is greator");
    }
}


//function to check if a number is prime or not 
public static boolean isprime(int n){
    if(n==2){
        return true;
    }
  for(int i=2;i<=n-1;i++){
      if(n%i==0){
        return false;
      }
  }
  return true;
}

//function to chexk if a number is factorial or not
public static int fact(int n){
    int fact=1;
    for(int i=1;i<=n;i++){
        fact=fact*i;

    }
    return fact;
}
// function to reverse a number
public static void reversenum(int n){
    int number =n;
    int reverse=0;
    while (n>0) {
        int lastdigit=n%10;
        reverse= reverse*10+lastdigit;
        n=n/10;

        
    }
    System.out.println(reverse);
    System.out.println("the original number"+number);
}
//function to count the digit in a number 
public static void countnum(int n){
 String s=String.valueOf(n);
 System.out.println(s);
 int length =s.length();
 System.out.println("the number of digits in a number is "+length);

}
 
  



    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.println("enter the value of a");
        // int a = sc.nextInt();
        // System.out.println("enter the value of b");
        // int b = sc.nextInt();
        // System.out.println("enter the value of c");
        // int c= sc.nextInt();
        // //function call
        // maxthree(a, b, c);
//         int n=5;
//     //    System.out.println( isprime(n));
// System.out.println(fact(n));
int n=2001;
countnum(n);

    }
}
