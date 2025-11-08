package patternspart1;

class reversenumbertriangle {
    //function to print the reverse number traingle
    public static void RNT(int n){

        //outer loop
        for(int i=1;i<=n;i++){
            //loop for spaces
            for(int k=1;k<=i-1;k++){
                System.out.print(" ");
            }
            //inner loop
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int n=4; //number of lines or number of rows
        RNT(n);
    }
}