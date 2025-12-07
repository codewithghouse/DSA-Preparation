package paftersem;

public class pattern2 {
// * * * *
// * * *
// * *
// *
public static void pattern(int n){
    //outer loop for rows
    for(int i=1;i<=n;i++){
        //inner loop for columns
        for(int j=1;j<=n-i+1;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
}
public static void main(String[] args) {
    int n=4;
    pattern(n);
}

}
