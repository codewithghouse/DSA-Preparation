package patternspart1;

public class rhombuspattern {
    //function to print the rhombus pattern
    public static void rhumbus(int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //first inner loop for spaces
            for(int j=1;j<=i-1;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        int n=4; //number of 
        rhumbus(n);
    }
}
