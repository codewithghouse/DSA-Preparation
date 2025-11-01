package functions;

import practice.factorial;

public class bino {

    // function to find the factorial
    public static int Factorial(int x){
        int fact=1;
        for(int i=1;i<=x;i++){
            fact=fact*i;

        }
        return fact;

    }
    public static void main(String[] args) {
        int n=5;
        int r=2;
      
    
        int a=Factorial(n);
        int b=Factorial(r);
        int c=Factorial(n-r);
        System.out.println("a ="+a);
        System.out.println("b= "+b);
        System.out.println("c ="+c);


        
// binomial coefficeint formula is here

        int Bino=(a/(b*c));
        System.out.println("the binonila coefficint of a numbers are :"+Bino);

    }
}
