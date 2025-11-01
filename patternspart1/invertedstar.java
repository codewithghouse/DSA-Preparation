package patternspart1;

public class invertedstar {
public static void main(String[] args) {
    System.out.println("inverted star pattern :");
    int n=4;
    for(int i=1;i<=4;i++){
        for(int j=1;j<=n-i+1;j++){
    System.out.print("*");
        }
        System.out.println();
    }
}   
}
