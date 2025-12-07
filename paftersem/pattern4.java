package paftersem;



public class pattern4 {
    public static void pattern(int n){
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=n;j++){
                if(i==1 || j==1 || i==n ||j==n){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
            
        }
    }
 public static void main(String[] args) {
    int n=4;//number of lines
    pattern(n);
 }   
}
