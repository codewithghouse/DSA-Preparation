package paftersem;

public class pattern3 {

    public static void pattern(int n){
        //outer loop for rows
        for(int i=1;i<=n;i++){
            //inner loop for columns
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }
 public static void main(String[] args) {
    int n=4;
    pattern(n);

 }   
}
