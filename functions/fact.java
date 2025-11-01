package functions;

public class fact {

    // factorial function
    public static int Factorial(int x){
        if(x<1){
            System.out.println("the number sholud be greater than");
            
        }
        int fact=1;

        for(int i=1;i<=x;i++){
            fact=fact*i;
            
        }
        return fact;

    }
    public static void main(String[] args) {
        int x=3;
        if(x<0){
            System.out.println("the number should be greater than 0");
        }else{
            System.out.println("the factorial of a number is "+Factorial(x));
        }
        
    }
}
