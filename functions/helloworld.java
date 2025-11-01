package functions;

import variable.sum;

public class helloworld {
    // making our own function
 public static void hello(){
    System.out.println("this is inside the hello function");
    return;
 }
//  function sum
  public static int sum(int a,int b){
    int sum=a+b;
System.out.println(sum);
    return sum;

        
    }
    public static void main(String[] args) {
        System.out.println("this is inside the main function");
        // calling our function
        hello();
        sum(5,5);
        
    }
}
