package paftersem;

public class pattern1 {
// *
// * *
// * * *
// * * * *

public static void pattern(int n){
//outer loop for rows
for(int i=1;i<=n;i++){
    //inner loop for columns 
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
    System.out.println("");
}
}
public static void main(String[] args) {
    int n=4; //number of rows
    pattern(n);

}

}
