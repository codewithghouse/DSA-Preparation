package patternspart1;

public class hollowrectangle {
   public static void main(String[] args) {
    System.out.println("hollow rectangle pattern :");
    // number of rows.lines
    int n=4;
    // outer loop
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j==1 || j==n){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
        }
        System.out.println();
    }
   }
}
