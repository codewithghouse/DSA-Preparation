package patternspart1;

public class zeroone {
    public static void main(String[] args) {
        int n=5;
        // number of lines five hai
        // yaani outer loop 1 se 5 tak chalta
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                if((i+j)%2 == 0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
