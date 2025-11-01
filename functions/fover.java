package functions;

public class fover {
    // method 1 to calcalate sum of 2 parameters
    public static int sum(int a ,int b){
        return a+b;
    }
    // method 2 to calculate sum of 3 numbers
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        // calling the functions
       System.out.println("the sum of 2 numbers are "+  sum(1, 2));
       System.out.println("-------");
       System.out.println("the sum of 3 numbers are "+sum(1,2,3));
        
    }
}
