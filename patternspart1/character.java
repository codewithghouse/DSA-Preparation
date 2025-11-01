package patternspart1;

public class character {
    // character pattern
    public static void main(String[] args) {
        char ch='a';
        int n=3;
        // outer loop
        for(int i=1;i<=n;i++){
            // inner loop
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                // ch++ ,ye ham isliye lere taake character ke baad sudden character dusra hai
                ch++;
            }
            System.out.println();
        }
    }
}
