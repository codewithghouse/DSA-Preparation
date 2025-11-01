package patternspart1;

public class star {
    // star pattern
// 4 lines of patterns it means 4 row
    public static void main(String[] args) {
        int n=4;
    for(int i=1;i<=n;i++){
        // outer loop  is done
        // inner is now
        for(int j=i;j<=i;j++){
            System.out.println("*");
        }
        System.out.println();
    }
    }
}
